package com.liamdjolly.shared;

/**
 * Simple object to represent a single user
 */
public class User {

    private String firstName;
    private String lastName;
    private String title;
    private String company;

    public User(final String firstName, final String lastName, final String title, final String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(final String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", title='" + title + '\'' +
               ", company='" + company + '\'' +
               '}';
    }
}
