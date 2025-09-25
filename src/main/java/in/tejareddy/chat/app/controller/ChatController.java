package in.tejareddy.chat.app.controller;

import in.tejareddy.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {


    @MessageMapping("/SendMessage")
    @SendTo("/topic/messages")
    public ChatMessage SendMessage(ChatMessage message){
        return message;
    }

    @GetMapping
    public String chat(){
        return "chat";
    }
}
