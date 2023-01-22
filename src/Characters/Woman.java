package Characters;

public class Woman extends Character{
    String name;
    public Woman(String name) {
        super(name);
    }

    @Override
    public void canPlant() {
        System.out.println(name + " " + "могла тоже что-нибудь посадить");
    }
}

