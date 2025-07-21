package com.hexagonal.notificaciones.domain.models;

public class Notifications {

    private String recipient;
    private String message;
    private TypeMessage typeMessage;

    public Notifications(String recipient, String message, TypeMessage typeMessage) {
        this.recipient = recipient;
        this.message = message;
        this.typeMessage = typeMessage;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TypeMessage getTypeMessage() {
        return typeMessage;
    }

    public void setTypeMessage(TypeMessage typeMessage) {
        this.typeMessage = typeMessage;
    }

    public enum TypeMessage {
        EMAIL,
        SMS,
        PUSH
    }


}
