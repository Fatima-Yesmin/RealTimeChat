package com.dailycode.chat_app.client;

import com.dailycode.chat_app.Message;
import java.util.ArrayList;

public interface MessageListener {
    void onMessageReceive(Message message); // Correct method name

    void onActiveUsersUpdated(ArrayList<String> users);
}

