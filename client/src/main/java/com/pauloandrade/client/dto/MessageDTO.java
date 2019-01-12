package com.pauloandrade.client.dto;

public class MessageDTO {

    private String message;
    private int clientPort;
    private int webPort;

    public MessageDTO() {
    }

    public MessageDTO(String message, int clientPort, int webPort) {
        this.message = message;
        this.clientPort = clientPort;
        this.webPort = webPort;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getClientPort() {
        return clientPort;
    }

    public void setClientPort(int clientPort) {
        this.clientPort = clientPort;
    }

    public int getWebPort() {
        return webPort;
    }

    public void setWebPort(int webPort) {
        this.webPort = webPort;
    }
}
