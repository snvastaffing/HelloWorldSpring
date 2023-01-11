package org.snva.hws.model;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDateTime;

public class SingletonDemo {
        String data = LocalDateTime.now().toString();

    public String getData() {
        return data;
    }
}
