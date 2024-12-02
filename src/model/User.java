package model;

import java.util.Objects;
//This class
public class User {
    //Encapsulated fields for user details
    private String userName;
    private String email;
//Constructor to initialize user details
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
    //empty constructor
    public User() {

    }


    //
    public void displayDetails(){
        System.out.println("UserName: " + userName);
        System.out.println("Email: " + email);
    }
    //Getters and Setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "model.User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, email);
    }
}
