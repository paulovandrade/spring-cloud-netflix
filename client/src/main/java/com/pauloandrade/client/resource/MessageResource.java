package com.pauloandrade.client.resource;

import com.pauloandrade.client.dto.MessageDTO;
import com.pauloandrade.client.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public MessageDTO getMessage() {
        return messageService.getMessage();
    }
}
