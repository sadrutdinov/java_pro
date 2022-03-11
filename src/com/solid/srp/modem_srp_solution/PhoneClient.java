package com.solid.srp.modem_srp_solution;



public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());

        phone.dial("123214321");
        phone.send("data text");
        phone.receive();
        phone.disconnect();

    }
}
