package com.ms.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "SUBSCRIPTION")
public class MessageSubscription extends Message {

    public MessageSubscription(Message message) {
        id = message.getId();
        msisdn = message.getMsisdn();
        timestamp = message.getTimestamp();
    }
}
