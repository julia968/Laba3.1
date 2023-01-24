package garden;

import Characters.Character;
import Characters.Mary;
import enums.Seasons;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Character> characters;
    private String name;


    public Garden(String name) {
        this.name = name;
    }
    private String leftPartOfGarden = "Левый край сада";
    private String rightPartOfGarden = "Правый край сада";
    private double numberOfPlants = Math.random()*100;




    public static class GardenPlants {
       private String name;
       private String colour;
       private String size;
       private String status;
       private String placeOfGrowth;
       private Seasons seasons;
       private double blossom = 0.5;
        public GardenPlants(String name, String colour, String size, String status) {
            this.name = name;
            this.colour = colour;
            this.size = size;
            this.status = status;
        }





        Earth earth = new Earth("черной", "земли");
        public void grow1() {
            setPlaceOfGrowth(earth.getColour() + " " + earth.getName());

            System.out.println(getSize() + " " +  getColour() + " " + getName() + " росли из " + placeOfGrowth);
        }

        public String grow2() {
            setPlaceOfGrowth("траву");
         String sentence = getColour() + " " + getName() + ", которые росли сквозь " + placeOfGrowth + " " + status;
            return sentence;

        }

        public void blossom() {
            int parameter = 3;
            int a = 2;
            int b = 4;
            int c = 6;
            while (blossom>0 && blossom <1) {
                if(parameter<a) {
                    blossom -= 0.3;
                    setSeasons(Seasons.WINTER);
                    String str = String.format("%.0f", blossom*100);
                    System.out.println("Если наступит " + seasons + ", то растений распустится на 30% меньше и останется: " + str + "%");

                }
                if (parameter>a && parameter<b) {
                    blossom +=0.5;
                    setSeasons(Seasons.SPRING);
                    String str = String.format("%.0f", blossom*100);
                    System.out.println("Если наступит " + seasons + ", то растений распустится еще больше и станет: " + str + "%");
                }

                if(parameter>b && parameter<c) {
                    blossom +=0.2;
                    setSeasons(Seasons.SUMMER);
                    String str = String.format("%.0f", blossom*100);
                    System.out.println("Если наступит " + seasons + ", то все будет цвести и растений будет: " + str + "%");
                }

                if (parameter > c) {
                    blossom -=0.4;
                    setSeasons(Seasons.AUTUMN);

                }

            }
    }



        public String getName() {
            return name;
        }

        public void setSeasons(Seasons seasons) {
            this.seasons = seasons;
        }

        public String getColour() {
            return colour;
        }

        public String getSize() {
            return size;
        }

        public String getStatus() {
            return status;
        }

        public void setPlaceOfGrowth(String placeOfGrowth) {
            this.placeOfGrowth = placeOfGrowth;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public int hashCode() {
            int result;
            result = getName().hashCode() * getSize().hashCode() * getColour().hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass() ) return false;
            GardenPlants gardenPlants = (GardenPlants) obj;
            return gardenPlants.name == name && gardenPlants.size == size && gardenPlants.colour == colour;
        }


    }
    //немного побродив по саду
    public static class  GardenMary {
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
                Thread.sleep(1000);
            } catch (InterruptedException
                    e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " перешла из " + pointOfDeparture + " в " + pointOfDestination);
            setLocation(pointOfDestination);
        }
        public GardenMary(String name) {
            this.name = name;
        }
    }


    public String live() {
        String phrase;
        if (numberOfPlants > 0) {
            phrase = getName() + " не погиб!";
        } else {
            phrase = getName() + " погиб!";
        }
        return phrase;
    }


    GardenMary mary1 = new GardenMary("Мэри");

    private ArrayList<String> grass = new ArrayList<String>();
    int numberOfLeaves = (int) Math.ceil(Math.random()*100);
    public void consistOnLeaves() {
        int i = 0;
        while (i < numberOfLeaves) {
            String string = String.format("Лист%d", i);
            grass.add(i, string);
            i++;
        }
        int difference = (int) Math.ceil(Math.random()*10);
        int j = difference;
        while(grass.size() - difference > 0) {
            if (mary1.getLocation().equals(leftPartOfGarden) && grass.size() - difference > 0) {
                System.out.printf("Листьев осталось: %d\n", grass.size());
                mary1.wonder(name, leftPartOfGarden, rightPartOfGarden);
                while (j > 0) {
                    grass.remove(j);
                    j--;
                }
                System.out.printf("Мэри уничтожила %d листьев\n", difference);
                difference = (int) Math.ceil(Math.random()*10);
                j = difference;
            }
            if (mary1.getLocation().equals(rightPartOfGarden) && grass.size() - difference > 0) {
                System.out.printf("Листьев осталось: %d\n", grass.size());
                mary1.wonder(name, rightPartOfGarden, leftPartOfGarden);
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
        if (mary1.getLocation().equals(leftPartOfGarden)) {
            mary1.wonder(name, leftPartOfGarden, rightPartOfGarden);
        }
        else {
            mary1.wonder(name, rightPartOfGarden, leftPartOfGarden);
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

    public String getName() {
        return name;
    }
}
