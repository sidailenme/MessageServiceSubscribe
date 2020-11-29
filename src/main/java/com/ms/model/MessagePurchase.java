package com.ms.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "PURCHASE")
public class MessagePurchase extends Message {

    public MessagePurchase(Message message) {
        id = message.getId();
        msisdn = message.getMsisdn();
        timestamp = message.getTimestamp();
    }
}
