package garden;

import Characters.Character;
import Characters.Mary;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Character> characters;
    private String name;

    public void addCharacter(Character character) {
        characters.add(character);
    }
    public Garden(String name) {
        this.name = name;
    }
    private String leftPartOfGarden = "Левый край сада";
    private String rightPartOfGarden = "Правый край сада";


    public static class GardenPlants {
        String name;
        String colour;
        String size;
        private String placeOfGrowth;
        public GardenPlants(String name, String colour, String size) {
            this.name = name;
            this.colour = colour;
            this.size = size;
        }



        Earth earth = new Earth("черной", "земли");
        public void grow(String placeOfGrowth) {
            setPlaceOfGrowth(earth.getColour() + " " + earth.getName());

            System.out.println(this.size + " " +  this.colour + " " + this.name + " росли из" + placeOfGrowth);
        }



        public String getName() {
            return name;
        }

        public String getColour() {
            return colour;
        }

        public String getSize() {
            return size;
        }

        public void setPlaceOfGrowth(String placeOfGrowth) {
            this.placeOfGrowth = placeOfGrowth;
        }
    }
    //немного побродив по саду
    class GardenMary {
        private String name;
        private String location = "Левый край сада";
        public String getName() {
            return name;
        }
        public void setLocation(String location){
            this.location = location;
        }
        public String getLocation() {
            return location;
        }
        public void wonder(String object, String pointOfDeparture, String pointOfDestination) {
            System.out.println(getName() + " бродит по " + object);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " перешла из " + pointOfDeparture + " в " + pointOfDestination);
            setLocation(pointOfDestination);
        }
        public GardenMary(String name) {
            this.name = name;
        }
    }
    GardenMary mary = new GardenMary("Мэри");

    private ArrayList<String> grass = new ArrayList<String>();
    int numberOfLeaves = (int) Math.ceil(Math.random()*100);
    public void method() {
        int i = 0;
        while (i < numberOfLeaves) {
            String string = String.format("Лист%d", i);
            grass.add(i, string);
            i++;
        }
        int difference = (int) Math.ceil(Math.random()*10);
        int j = difference;
        while(grass.size() - difference > 0) {
            if (mary.getLocation().equals(leftPartOfGarden) && grass.size() - difference > 0) {
                System.out.printf("Листьев осталось: %d\n", grass.size());
                mary.wonder(name, leftPartOfGarden, rightPartOfGarden);
                while (j > 0) {
                    grass.remove(j);
                    j--;
                }
                System.out.printf("Мэри уничтожила %d листьев\n", difference);
                difference = (int) Math.ceil(Math.random()*10);
                j = difference;
            }
            if (mary.getLocation().equals(rightPartOfGarden) && grass.size() - difference > 0) {
                System.out.printf("Листьев осталось: %d\n", grass.size());
                mary.wonder(name, rightPartOfGarden, leftPartOfGarden);
                while (j > 0) {
                    grass.remove(j);
                    j--;
                }
                System.out.printf("Мэри уничтожила %d листьев\n", difference);
                difference = (int) Math.ceil(Math.random()*10);
                j = difference;
            }
        }
        System.out.printf("Листьев осталось: %d\n", grass.size());
        if (mary.getLocation().equals(leftPartOfGarden)) {
            mary.wonder(name, leftPartOfGarden, rightPartOfGarden);
        }
        else {
            mary.wonder(name, rightPartOfGarden, leftPartOfGarden);
        }
        int a = grass.size();
        int c = a;
        int b = grass.size() - 1;
        while (c > 0) {
            grass.remove(b);
            c--;
            b--;
        }
        System.out.printf("Мэри уничтожила последние %d листьев\n", a);
    }
}
