package com.solid.srp.modem_srp_violation;

public interface IPhone {
    // первые два метода отвечают за связь
    void dial(String phoneNumber);
    void disconnect();
    // // методы отвечают за информацию
    void send(String message);
    int receive();
}
