package com.example.ws.controller;

import com.example.ws.model.ChatInMessage;
import com.example.ws.model.ChatOutMessage;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by gavinkim at 2019-02-04
 */
@Controller
public class ChatController {

    @MessageMapping("/guestchat")
    @SendTo("/topic/guestchats")
    public ChatOutMessage handleMessaging(ChatInMessage message) throws Exception{
        Thread.sleep(1000);
        return new ChatOutMessage(message.getMessage());
    }

    @MessageMapping("/guestupdate")
    @SendTo("/topic/guestupdates")
    public ChatOutMessage handleUserIsTyping(ChatInMessage message) throws Exception{
        return new ChatOutMessage("Someone is typing...");
    }

    @MessageMapping("/guestjoin")
    @SendTo("/topic/guestnames")
    public ChatOutMessage handleMemberJoins(ChatInMessage message) throws Exception {
        return new ChatOutMessage(message.getMessage());
    }

    @MessageExceptionHandler
    @SendTo("/topic/errors")
    public ChatOutMessage handleExcpetion(Throwable exception) {

        ChatOutMessage myError = new ChatOutMessage("An error happened.");
        return myError;
    }
}
