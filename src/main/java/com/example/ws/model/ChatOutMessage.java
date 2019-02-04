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
public class ChatOutMessage {
    private String content;
    private String groupName;
    private Date timestamp;

    public ChatOutMessage(String content) {
        this.content = content;
    }
}
