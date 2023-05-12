package com.vjem.exercisedevops.resource;

import com.vjem.exercisedevops.models.Greeting;
import com.vjem.exercisedevops.models.Response;
import com.vjem.exercisedevops.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/DevOps")
public class DevOpsController {


    private final GreetingService greetingService;

    public DevOpsController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    Response executeMessagePost(@RequestBody Greeting request) {
        return greetingService.executeMessage(request);
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
    ResponseEntity<String> anotherHttpMethods() {
        return ResponseEntity.ok("ERROR");
    }
}
