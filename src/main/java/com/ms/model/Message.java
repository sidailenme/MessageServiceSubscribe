package com.ms.model;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public class Message {

    @Id
    protected long id;

    protected int msisdn;

    protected Action action;

    protected Timestamp timestamp;
}
