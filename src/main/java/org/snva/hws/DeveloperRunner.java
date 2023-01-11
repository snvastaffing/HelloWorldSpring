package org.snva.hws;


import org.snva.hws.designpatterns.creational.ReadUtils;
import org.snva.hws.model.Role;
import org.snva.hws.model.User;

import java.util.ArrayList;
import java.util.List;

public class DeveloperRunner {
    public static void main(String[] args) {
/**
        if (true) {
            ReadUtils readUtils = ReadUtils.getInstance();
            System.out.println("You entered "+ readUtils.readString("Enter the name", "error can not read the name "));

            ReadUtils readUtils2 = ReadUtils.getInstance();
            ReadUtils readUtils3 = ReadUtils.getInstance();
            ReadUtils readUtils4 = ReadUtils.getInstance();


        }else {

            ArrayList usersList = new ArrayList();


            Role learner = new Role();
            learner.setRoleId(1l);
            learner.setRoleName("learner");
            learner.setRoleDescription("This is just a learner role ");

            Role admin = new Role();
            admin.setRoleId(2l);
            admin.setRoleName("admin");
            admin.setRoleDescription("This is just an admin role ");

            Role architect = new Role();
            admin.setRoleId(3l);
            admin.setRoleName("architect");
            admin.setRoleDescription("This is just a Learner role ");


            ArrayList<Role> rolesforAlex = new ArrayList<>();
            rolesforAlex.add(admin);

            ArrayList<Role> rolesforViet = new ArrayList<>();
            rolesforViet.add(architect);

            Role rolesforDheeraj = new ArrayList<>();
            rolesforDheeraj.add(learner);
            rolesforDheeraj.add(admin);
            rolesforDheeraj.add(architect);


            User dheeraj = new User();
            dheeraj.setContact("+1 11111 11111");
            dheeraj.setEmail("dheeraj@careerera.com");
            dheeraj.setUserId(1l);
            dheeraj.setUserName("dheerajthedev");
            dheeraj.setPassword("123456"); // later we will encrypt the same;
            dheeraj.setLastName("Singh");
            dheeraj.setFirstName("Dheeraj");
            dheeraj.setRoles(rolesforDheeraj);

            User viet = new User();
            viet.setContact("+1 11111 11111");
            viet.setEmail("viet@careerera.com");
            viet.setUserId(2l);
            viet.setUserName("vietthedev");
            viet.setPassword("123456"); // later we will encrypt the same;
            viet.setLastName("S");
            viet.setFirstName("viet");
            viet.setRoles(rolesforViet);

            User alex = new User();
            alex.setContact("+1 11111 11111");
            alex.setEmail("alex@careerera.com");
            alex.setUserId(3l);
            alex.setUserName("alexthedev");
            alex.setPassword("123456"); // later we will encrypt the same;
            alex.setLastName("Singh");
            alex.setFirstName("alex");
            alex.setRoles(rolesforAlex);

            List<User> users = new ArrayList<>();
            users.add(alex);
            users.add(dheeraj);
            users.add(viet);

            users.forEach(x -> {
                System.out.print(x.getFirstName());
                System.out.print(" having ");
                System.out.print(x.getRoles().size());
                System.out.print(" of roles details -> ");
                System.out.println(x);
            });
        }
 */
    }

}