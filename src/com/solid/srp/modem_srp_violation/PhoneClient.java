package com.solid.srp.modem_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();


        phone.dial("12345");
        phone.send("message text");
        phone.receive();
        phone.disconnect();
    }
}
