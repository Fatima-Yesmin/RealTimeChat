package com.dailycode.chat_app.client;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String username = JOptionPane.showInputDialog(
                        null, // parentComponent
                        "Enter Username (Max : 16 Characters):", // message
                        "Chat Application", // title
                        JOptionPane.QUESTION_MESSAGE // messageType
                );
                if (username == null || username.isEmpty() || username.length() > 16) {
                    JOptionPane.showConfirmDialog(
                            null, // parentComponent
                            "Invalid Username", // message
                            "Error", // title
                            JOptionPane.ERROR_MESSAGE // optionType
                    );
                    return;
                }

                ClientGUI clientGUI = null;
                try {
                    clientGUI = new ClientGUI(username);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                clientGUI.setVisible(true);
            }
        });
    }
}
