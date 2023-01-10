package org.snva.hws.config;

import org.snva.hws.model.Role;
import org.snva.hws.model.User;
import org.springframework.context.annotation.Bean;
import org.w3c.dom.ls.LSInput;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsersConfig {

    public List<Role> getRolesDheeraj() {
        List<Role> roles = new ArrayList<>();
        Role admin = new Role();
        admin.setRoleName("admin");
        admin.setRoleDescription("Role for an admin ");
        admin.setRoleId(1l);

        Role learner = new Role();
        learner.setRoleId(2l);
        learner.setRoleDescription("learner s description ");
        learner.setRoleName("learner");

        Role architect = new Role();
        architect.setRoleName("architect");
        architect.setRoleId(3l);
        architect.setRoleDescription("its ab architect role");

        roles.add(admin);
        roles.add(architect);
        roles.add(learner);
        return roles;
    }


    public User dheeraj(){
    User user = new User();
        user.setUserId(1l);
        user.setUserName("Dheerajthedev");
        user.setFirstName("Dheeraj");
        user.setPassword("1234");
        user.setEmail("dheeraj@careerera.com");
        user.setLastName("Singh");
        user.setContact("+1 11111 1111 ");
        user.setRoles(getRolesDheeraj());
         return user;
}

    @Bean(name = "users")
    public List<User> users(){
        List<User> allUsers= leadFromFile();
        return allUsers;
    }

    private List<User> leadFromFile() {
        List<User> allUsers = new ArrayList<>();
        try{
            byte [] allBytes=Files.readAllBytes(Paths.get("d:\\user.txt"));
            String allLines= new String(allBytes);
            for (String line : allLines.split("\n")) {
                    String cols[]= line.split(",");
                    User user = new User();
                    user.setUserId(new Long(cols[0]));
                    user.setUserName(cols[1]);
                    user.setFirstName(cols[2]);
                    user.setPassword(cols[3]);
                    user.setEmail(cols[4]);
                    user.setLastName(cols[5]);
                    user.setContact(cols[6]);
                    user.setRoles(getRoles(cols[7]));
                    allUsers.add(user);
            }
        }catch (Exception ee){
            System.err.println(ee.getMessage());
        }
        return  allUsers;
    }

    private List<Role> getRoles(String rolesString) {
        List<Role> roles = new ArrayList<>();
        rolesString= rolesString.replace('\r',' ');
        rolesString= rolesString.trim();
        String[] rolesArr= rolesString.split("-");
        for (String role: rolesArr ) {
            if (role.equalsIgnoreCase("")|| role==null){
                String com=rolesString;
                roles.addAll(getRolesDheeraj().stream().filter(x->x.getRoleName().equalsIgnoreCase(com)).collect(Collectors.toList()));
            }
            else{

            roles.addAll(getRolesDheeraj().stream().filter(x->x.getRoleName().equalsIgnoreCase(role)).collect(Collectors.toList()));

            }
        }
        return  roles;
    }
}
