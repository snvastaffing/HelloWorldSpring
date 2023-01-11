package org.snva.hws.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


// XML Init and Destroy init-init-method destroy-destory properties
// JavaCode- two interfaces {InitializingBean , DisposableBean }
// Annotation Post Construct and  PreDestroy annotations

public class Role implements  DisposableBean, InitializingBean {
    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }

    // datas
    private Long roleId;
    private String roleName;
    private String roleDescription;


    // behaviours
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

//
//    public  void init(){
//        System.out.println("Role has been initialized");
//    }


    @PreDestroy
    public  void destroy(){
        System.out.println(this.roleName + " with "+this.roleId+" Role has been destroyed");
    }


    // added it for demo 2

   @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("Role has been initialized");
    }
}
