package com.designPatterns.behavioral.mediator;

import com.solid.isp.isp_violation.A;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");


        chat.setAdmin(admin);
        chat.addUserToChat(user);
        chat.addUserToChat(user2);

        user.sendMessage("hello, im user1");

        admin.sendMessage("admin tut");
    }
}
