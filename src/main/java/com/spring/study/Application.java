package com.spring.study;

import com.spring.study.logger.ConsoleEventLogger;
import com.spring.study.logger.EventLogger;
import com.spring.study.model.Client;
import com.spring.study.model.Event;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Application {
    private Client client;
    private EventLogger eventLogger;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        Application app = ctx.getBean(Application.class);
        app.logEvent(ctx.getBean(Event.class));
        app.logEvent(ctx.getBean(Event.class));
        app.logEvent(ctx.getBean(Event.class));
        app.logEvent(ctx.getBean(Event.class));
        ctx.close();
    }

    public Application(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private void logEvent(Event event) {
        eventLogger.logEvent(event);
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }
}
