package garden;

import enums.Smell;

public class Earth {
   private Smell smell;
    public Earth() {
       this.smell = smell;
    }


    private String colour;
    private String name;
    public Earth(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }
}
