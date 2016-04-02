package com.liamdjolly.shared;

import java.util.ArrayList;
import java.util.List;

/**
 * Util class for generating users
 */
public final class UserGenerator {
    public static List<User> createUsers(){
        List<User> userList = new ArrayList<>();

        //user data generated using https://www.mockaroo.com
        userList.add(new User("Bruce","George","Accountant II","Fivespan"));
        userList.add(new User("Pamela","Stone","Product Engineer","Mynte"));
        userList.add(new User("Tammy","Chapman","Chief Design Engineer","Linklinks"));
        userList.add(new User("Teresa","Reynolds","Health Coach II","Feedspan"));
        userList.add(new User("Lawrence","Lane","Business Systems Development Analyst","Divanoodle"));
        userList.add(new User("Amanda","Perry","Office Assistant III","Dynava"));
        userList.add(new User("Christopher","Morgan","Junior Executive","Yata"));
        userList.add(new User("Cheryl","Mills","Staff Accountant III","Twitterbridge"));
        userList.add(new User("Samuel","Lane","Senior Financial Analyst","Plajo"));
        userList.add(new User("Theresa","Robertson","Developer I","Dabshots"));

        return userList;
    }
}
