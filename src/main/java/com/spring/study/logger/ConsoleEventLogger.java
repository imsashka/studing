package com.spring.study.logger;

import com.spring.study.model.Event;

public class ConsoleEventLogger implements EventLogger{
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
