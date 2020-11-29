package com.ms.controller;

import com.ms.model.Message;
import com.ms.service.interfaces.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MessageController {

    private MessageService messageService;

    @PostMapping("/")
    public ResponseEntity<Message> takeMessage(@RequestBody Message message) {
        System.out.println(message);
        messageService.save(message);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}