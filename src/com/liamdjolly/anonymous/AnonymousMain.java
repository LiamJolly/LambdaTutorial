package com.liamdjolly.anonymous;

import com.liamdjolly.shared.User;
import com.liamdjolly.shared.UserGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates using anonymous classes to filter user data
 */
public final class AnonymousMain {
    public static void main(String[] args) {
        List<User> userList = UserGenerator.createUsers();

        // Define a filter to filter on company name
        UserFilter companyFilter = new UserFilter() {
            @Override
            public List<User> filter(final List<User> users, final String company) {
                List<User> filteredUsers = new ArrayList<>();
                for (User user : users) {
                    if (user.getCompany().equalsIgnoreCase(company)) {
                        filteredUsers.add(user);
                    }
                }
                return filteredUsers;
            }
        };

        System.out.println("Filtered by company:");
        System.out.println(companyFilter.filter(userList, "Linklinks"));

        //Define a filter to filter on first name
        UserFilter firstNameFilter = new UserFilter() {
            @Override
            public List<User> filter(List<User> users, String username) {
                List<User> filteredUsers = new ArrayList<>();
                for (User user : users) {
                    if (user.getFirstName().equalsIgnoreCase(username)) {
                        filteredUsers.add(user);
                    }
                }
                return filteredUsers;
            }
        };

        System.out.println("Filtered by first name:");
        System.out.println(firstNameFilter.filter(userList, "Bruce"));
    }
}
