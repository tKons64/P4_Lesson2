package me.tretyakovv.p4_lesson2;

import java.io.IOException;

public class User {

    private String login;

    private String email;

    public User() {
    }

    public User(String login, String email) {
        if (login.equals(email)) {
            throw new IllegalArgumentException("Exception: логин не должен быть равен email!");
        }
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
