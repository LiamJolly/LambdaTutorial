package com.liamdjolly.anonymous;

import com.liamdjolly.shared.User;

import java.util.List;

/**
 * Very simple interface for filtering user.
 * Demonstrates using anonymous classes to filter user info.
 */
public interface UserFilter {

    List<User> filter(List<User> users, String target);
}
