package com.lowork.rps.message;

import com.lowork.rps.message.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/messages", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class MessageController {
    @GetMapping(value = "/public-message")
    public Message publicEndpoint() {
        return new Message("All good. You DO NOT need to be authenticated to call /api/public.");
    }

    @GetMapping(value = "/private-message")
    public Message privateEndpoint() {
        return new Message("All good. You can see this because you are Authenticated.");
    }

    @GetMapping(value = "/private-scoped-message")
    public Message privateScopedEndpoint() {
        return new Message("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope");
    }
}
