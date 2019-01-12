package com.pauloandrade.web.resource;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pauloandrade.web.dto.MessageDTO;
import com.pauloandrade.web.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    private static String msgFallback = "Vish deu ruim";

    @Autowired
    private MessageService messageService;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/messages")
    public MessageDTO getMessage() {
        return messageService.getMessage();
    }

    public String fallback() {
        return msgFallback;
    }
}
