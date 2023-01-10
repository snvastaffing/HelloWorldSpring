package org.snva.hws;
import org.snva.hws.config.UsersConfig;
import org.snva.hws.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(UsersConfig.class);
        applicationContext.refresh();
//        User dheeraj =(User) applicationContext.getBean("dheeraj");
       List<User> users =(List<User>) applicationContext.getBean("users");
        users.forEach(x->System.out.println(x));
    }
}

//package org.snva.hws;
//
//
//import org.snva.hws.model.Role;
//import org.snva.hws.model.User;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SpringRunner {
//    public static void main(String[] args) {
////        in the beginning we used to have the following implementations to user or wire our dependencies
////        1. BeanFactory (3x) (6x)
////        2. ApplicationContext
////                the folowing implementations :
//                    // 1. ClassPathXmlApplicationContext
//                    // 2. FileSystemXmlApplicationContext
//                    // 3. AnnotationConfigApplicationContext
//
//       //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("users-context.xml");
//         //   applicationContext = new FileSystemXmlApplicationContext("d:\\users-context.xml");
//        AnnotationConfigApplicationContext    applicationContext = new AnnotationConfigApplicationContext();
//
//
//        List<Integer> roles= (List<Integer>) applicationContext.getBean("rolesString");
//roles.forEach(x->System.out.println(x));
//        //User dheeraj=(User) applicationContext.getBean("dheeraj");
////        List<User> users=(List<User>) applicationContext.getBean("users");
//
//        //System.out.println(dheeraj);
//
////        users.forEach(x->{
////            System.out.println(x);
////        });
//
//    }
//}