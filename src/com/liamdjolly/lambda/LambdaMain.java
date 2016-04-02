package com.liamdjolly.lambda;

import com.liamdjolly.shared.User;
import com.liamdjolly.shared.UserGenerator;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Simple example of filtering user data using a lambda
 */
public final class LambdaMain {

    public static void main(String[] args) {
        List<User> userList = UserGenerator.createUsers();

        System.out.println("Filtered by company:");
        System.out.println(userList.stream()
                                   .filter(user -> user.getCompany().equalsIgnoreCase("Linklinks"))
                                   .collect(Collectors.toList()));

        System.out.println("Filtered by first name:");
        System.out.println(userList.stream()
                                   .filter(user -> user.getFirstName().equalsIgnoreCase("Bruce"))
                                   .collect(Collectors.toList()));
    }
}
