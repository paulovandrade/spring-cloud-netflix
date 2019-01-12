package com.pauloandrade.client.dto;

public class MessageWebDTO {

    private String message;
    private int webPort;

    public MessageWebDTO() {
    }

    public MessageWebDTO(String message, int webPort) {
        this.message = message;
        this.webPort = webPort;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getWebPort() {
        return webPort;
    }

    public void setWebPort(int webPort) {
        this.webPort = webPort;
    }
}
