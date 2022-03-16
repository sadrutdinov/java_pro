package com.solid.dip;

public class LoginManager {

    Authenticator authentication;

    public LoginManager(Authenticator authentication) {
        this.authentication = authentication;
    }

    // high  level class

    public void login(User user) {
        authentication.authentication(user);
    }
}
