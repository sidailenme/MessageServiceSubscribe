package com.ms.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.sql.Timestamp;

@Data
@Entity
public class Message {

    @Id
    protected long id;

    protected int msisdn;

    protected Action action;

    protected Timestamp timestamp;
}
