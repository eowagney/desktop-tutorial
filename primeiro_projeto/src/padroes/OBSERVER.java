package padroes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface EventListener {
    void update(String filename);
}

class EventManager {
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.getOrDefault(eventType, new ArrayList<>()).remove(listener);
    }

    public void notify(String eventType, String data) {
        for (EventListener listener : listeners.getOrDefault(eventType, new ArrayList<>())) {
            listener.update(data);
        }
    }
}

class Editor {
    public EventManager events = new EventManager();

    public void openFile(String filename) {
        events.notify("open", filename);
    }

    public void saveFile(String filename) {
        events.notify("save", filename);
    }
}

class EmailAlertsListener implements EventListener {
    @Override
    public void update(String filename) {
        System.out.println("EmailAlertsListener: E-mail enviado para o arquivo " + filename);
    }
}

class LoggingListener implements EventListener {
    @Override
    public void update(String filename) {
        System.out.println("LoggingListener: Log salvo para o arquivo " + filename);
    }
}

public class OBSERVER {
    public static void main(String[] args) {
        Editor editor = new Editor();

        EmailAlertsListener emailAlerts = new EmailAlertsListener();
        LoggingListener logging = new LoggingListener();

        editor.events.subscribe("save", emailAlerts);
        editor.events.subscribe("save", logging);

        editor.openFile("test.txt");
        editor.saveFile("test.txt");

        editor.events.unsubscribe("save", logging);

        editor.saveFile("another_test.txt");
    }
}