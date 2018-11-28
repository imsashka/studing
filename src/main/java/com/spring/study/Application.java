package com.spring.study;

import com.spring.study.logger.ConsoleEventLogger;
import com.spring.study.model.Client;

public class Application {
    private Client client;
    private ConsoleEventLogger eventLogger;
    public static void main(String[] args) {
    Application app = new Application();
    app.setClient(new Client("1", "John Smith"));
    app.setEventLogger(new ConsoleEventLogger());

    app.logEvent("Some event for user 1");
    }

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }
}
