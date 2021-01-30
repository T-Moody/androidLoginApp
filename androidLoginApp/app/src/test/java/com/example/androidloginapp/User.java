// This class manages user data
package com.example.androidloginapp;

public class User
{
    // -----------------------------------------------------------
    // Variables
    int    idNumber;  // Unique identifier for searching
    String username;  // User created name
    String password;  // User created password
    String email;     // Email used to create account
    String birthDate; // Users date of birth

    // -----------------------------------------------------------
    // No-args constructor for the User class.
    public User()
    {
        idNumber  = 0;
        username  = "";
        password  = "";
        email     = "";
        birthDate = "";
    }
    // -----------------------------------------------------------
    // Parameterized constructor for the User class.

    // -----------------------------------------------------------
    // Getters and setters.
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    // -----------------------------------------------------------
    // toString method returns a string of all user data.
    @Override
    public String toString() {
        return "User{" +
                "idNumber=" + idNumber +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
