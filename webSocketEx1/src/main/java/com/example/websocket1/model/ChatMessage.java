package com.example.websocket1.model;

public class ChatMessage {
    private MessageType messageType ;
    private String content;
    private String sender;



    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ChatMessage() {
    }

    public ChatMessage(MessageType messageType, String content, String sender) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
    }
}
