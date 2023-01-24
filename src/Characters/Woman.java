package Characters;

import enums.Status;

public class Woman extends Character{
    public Woman(String name) {
        super(name);
    }
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void canPlant() {
        System.out.println(getName() + " " + "могла тоже что-нибудь посадить");
    }
    @Override
    public String say() {
        setStatus(Status.MOUTHMOVEMENT);
        String phrase = getName() + " сказала об этом";
        return phrase;

    }
}

