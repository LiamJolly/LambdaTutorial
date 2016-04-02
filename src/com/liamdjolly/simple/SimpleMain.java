package com.liamdjolly.simple;

import com.liamdjolly.shared.User;
import com.liamdjolly.shared.UserGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Filters user data by using for loop and if statements
 */
public final class SimpleMain {

    public static void main(String[] args) {
        List<User> users = UserGenerator.createUsers();

        // get users by a company
        List<User> usersAtLinkLinks = new ArrayList<User>();
        for (User user: users){
            if ("Linklinks".equalsIgnoreCase(user.getCompany())){
                usersAtLinkLinks.add(user);
            }
        }
        System.out.println("Filtered by company:");
        System.out.println(usersAtLinkLinks);


        //get users by first name
        List<User> usersWithFirstNameBruce = new ArrayList<User>();
        for (User user: users){
            if ("Bruce".equalsIgnoreCase(user.getFirstName())){
                usersWithFirstNameBruce.add(user);
            }
        }
        System.out.println("Filtered by first name:");
        System.out.println(usersWithFirstNameBruce);
    }
}
