package com.example.coverage.demo;

import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class DemoCoverage {

    public String getCurrentStateOfDay(int timeOfDay) {
        String message = "Hello";
        if (timeOfDay >= 0 && timeOfDay < 12) {
            message = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            message = "Good Afternoon";
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            message = "Good Evening";
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            message = "Good Night";
        }
        return message;
    }

}
