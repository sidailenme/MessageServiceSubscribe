package com.ms.service.impl;

import com.ms.model.Message;
import com.ms.model.MessagePurchase;
import com.ms.model.MessageSubscription;
import com.ms.repository.MessageRepository;
import com.ms.service.interfaces.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private MessageRepository messageRepository;

    @Override
    public Message save(Message message) {
        switch (message.getAction()) {
            case PURCHASE: return messageRepository.save(new MessagePurchase(message));
            case SUBSCRIPTION: return messageRepository.save(new MessageSubscription(message));
        }
        throw new ClassCastException("Invalid action type");
    }
}
