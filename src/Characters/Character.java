package Characters;

import enums.Status;
import interfaces.Iplantable;

public abstract class Character implements Iplantable {
    private String name;


    public Character(String name) {
        this.name = name;
    }

    public abstract String say();


    public String getName() {
        return name;
    }
}
