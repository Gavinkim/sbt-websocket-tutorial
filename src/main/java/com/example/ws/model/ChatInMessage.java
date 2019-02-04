package com.example.ws.model;

import lombok.*;

import java.util.Date;

/**
 * Created by gavinkim at 2019-02-04
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChatInMessage {
    private String senderId;
    private String senderName;
    private String message;
    private Date timeStamp;

    public ChatInMessage(String message) {
        this.message = message;
    }
}
