package com.vjem.exercisedevops.service;

import com.vjem.exercisedevops.models.Greeting;
import com.vjem.exercisedevops.models.Response;
import org.springframework.stereotype.Service;

@Service

public class GreetingService {

    public Response executeMessage(Greeting greeting){
        return new Response("Hello "+ greeting.to() + " your message will be send");
    }

}
