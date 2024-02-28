package com.example.mymessenger;

import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    public static ChatHistory instance;
    private List<String> messages;

    private ChatHistory(){
        messages = new ArrayList<>();
    }
    public static ChatHistory getInstance(){
        if(instance==null){
            instance = new ChatHistory();
        }
        return instance;
    }
    public List<String> getMessages(){
        return messages;
    }
    public void addMessages(String message){
        messages.add(message);
    }
}
