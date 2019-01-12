package com.pauloandrade.client.service;

import com.pauloandrade.client.clients.WebClient;
import com.pauloandrade.client.dto.MessageDTO;
import com.pauloandrade.client.dto.MessageWebDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private Environment environment;

    @Autowired
    private WebClient webClient;

    public MessageDTO getMessage() {
        MessageWebDTO webMessage = webClient.getWebMessage();

        String message = webMessage.getMessage() + "Mensagem enviada pelo Client.";
        return new MessageDTO(message, Integer.valueOf(environment.getProperty("local.server.port")), webMessage.getWebPort());
    }
}
