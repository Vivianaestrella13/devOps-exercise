package com.vjem.exercisedevops.models;

public record Greeting(

        String message,
        String to,
        String from,
        Integer timeToLifeSec

) {


}
