package com.example.slutprojekt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.HtmlUtils;
import java.security.Principal;


@Controller
public class GreetingController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/chat")
    public String post() {
        return "chat";
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(ChatMessage message,Principal principal) throws Exception {
        Thread.sleep(100);

        Student student = studentRepo.findByEmail(principal.getName());

        return new Greeting( HtmlUtils.htmlEscape(message.getMessage()),student.getFirstName());
    }

}

