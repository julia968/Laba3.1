package Characters;

public class Woman extends Character{
    public Woman(String name) {
        super(name);
    }

    @Override
    public void canPlant() {
        System.out.println(getName() + " " + "могла тоже что-нибудь посадить");
    }
}

