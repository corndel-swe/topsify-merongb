package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersModel {
    private int id;
    private String username;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String last_name;
    private String email;
    private String avatar;
    private String password;

    public UsersModel() {}


    public UsersModel(int id, String username, String first_name, String last_name, String email, String avatar, String password) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.avatar = avatar;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getPassword() {
        return password;
    }
}
