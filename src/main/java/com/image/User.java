package com.image;

public class User {

    String name;
    String password;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return this.name.equals(((User) obj).getName());
        }
        else return false;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
