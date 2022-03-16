package com.solid.dip;



public class SimpleLogin implements Authenticator {

    // low level class

    @Override
    public boolean authentication(User user) {
        // logic - database
        return  true;
    }
}
