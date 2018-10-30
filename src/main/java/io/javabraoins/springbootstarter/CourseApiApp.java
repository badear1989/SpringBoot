package io.javabraoins.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String ... args){
        //tell spring boot to start this app and create a servlet container and host the app in that servlet container
        SpringApplication.run(CourseApiApp.class, args); // calling a statich method to which I am passing the class where I have my main method

    }
}
