package com.pauloandrade.web.dto;

public class MessageDTO {

    private String message;
    private int webPort;

    public MessageDTO() {
    }

    public MessageDTO(String message, int webPort) {
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
