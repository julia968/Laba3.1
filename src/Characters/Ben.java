package Characters;

import enums.Status;

public class Ben extends Character{
    private Status status;
    private String age;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Ben(String name, String age) {
        super(name);
        this.age = age;

    }

    @Override
    public String say(String subject, String sentence, Status status) {
        String phrase = "говорил " + subject + " " + sentence;
        setStatus(Status.MOUTHMOVEMENT);
        return phrase;
    }

    public Status getStatus() {
        return status;
    }

    public String getAge() {
        return age;
    }

    @Override
    public void canPlant() {
    }
}
