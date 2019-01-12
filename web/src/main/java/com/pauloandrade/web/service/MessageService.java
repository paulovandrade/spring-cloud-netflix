package com.pauloandrade.web.service;

import com.pauloandrade.web.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private Environment environment;

    public MessageDTO getMessage() {
        return new MessageDTO("Mensagem enviada pelo Web.", Integer.valueOf(environment.getProperty("local.server.port")));
    }
}
