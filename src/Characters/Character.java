package Characters;

import enums.Status;
import interfaces.Iplantable;

public abstract class Character implements Iplantable {
    String name;
    String object;
    String phrase;

    public Character(String name) {
        this.name = name;
    }

    public String say(String object, String phrase, Status status) {
        this.object = object;
        this.phrase= phrase;

        return object;
    }

    public String getObject() {
        return object;
    }

    public String getSubject() {
        return phrase;
    }

    public String getName() {
        return name;
    }
}
