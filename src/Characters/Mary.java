package Characters;

import classes.AgeCheck;
import enums.Condition;
import enums.MarysThings;
import enums.Smell;
import enums.Status;
import garden.*;


public class Mary extends Character {
    private int air;
    private int interest;
    private int energy;
    private Smell smell;
    private Status status;
    private int age;

    private String location;
    private MarysThings marysThings;
    private Condition condition;

    private double happiness;
    private double knowledge = 0.5;

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public Mary(String name) {
        super(name);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void breath(int air) {
        this.air = air;
        if (air <= 30) {
            setSmell(Smell.EARTH);
            setStatus(Status.BOWEDDOWN);
            System.out.println(getName() + " " + status + " и с удовольствием вдохнула " + smell);
        } if (air > 30 && air < 60) {
            System.out.println(getName() + "глубоко вздохнула");
        }
         if (air >= 60){
            setStatus(Status.WEED);
            System.out.println(getName() + " несколько раз глубоко вздохнула и " + status );

        }
    }

    private void setSmell(Smell smell) {
        this.smell = smell;
    }
    private void setMarysThings (MarysThings marysThings) {
        this.marysThings = marysThings;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void take(MarysThings marysThings) {
        setMarysThings(MarysThings.JUMPERS);
        System.out.println(getName() + " снова взялась за " + marysThings);
    }
    public void actionWithJumpers(int energy, String partOfBody) {
        setMarysThings(MarysThings.JUMPERS);
        this.energy = energy;
        if (energy <= 60) {
            System.out.println(getName() + " оставила в покое " + marysThings);
        } else {
            System.out.println(getName() + " перекинула " + marysThings + " через " + partOfBody);
        }
    }

    public void remember(MarysThings marysThings) {
        setMarysThings(MarysThings.JUMPERS);

        System.out.println(getName() + " вспомнила о "+ marysThings);

    }
    public void jump() {
        System.out.println(getName() + " " + "решила скакать");
    }
    public void watch(int interest) {
        this.interest = interest;
        if(interest >= 90) {
            System.out.println("Если " + getName() + " что-то заинтересует, то она остановится и разглядит");
        } else if (interest <90 ) {
            take(MarysThings.JUMPERS);
        }

    }
    SummerHouse twoGazebos = new SummerHouse("две беседки", "", "с каменными скамьями");
    Vases vases = new Vases("вазами","", "покрытыми мхом");
    public void seeSomething(String time) {
        String firstSubject = twoGazebos.getName() + " " + twoGazebos.getStatus();
        String secondSubject = vases.getName() + ", " + vases.getStatus();
        System.out.println(time + " " + getName() + " увидела " + firstSubject + " и " + secondSubject);
    }
    SummerHouse secondAlcove = new SummerHouse("второй беседки", " ", " ");
    public void stop() {
        String subject = secondAlcove.getName();
        setLocation("Возле ");
        System.out.println(location + " " + subject + " " + getName() + " остановилась");
    }

    @Override
    public void canPlant() {
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    FlowerBed flowerBed = new FlowerBed("клумба", "большая", "цветочная");
    public void beNextTo() {
        String subject = flowerBed.getSize() + " " + flowerBed.getStatus() + " " + flowerBed.getName();
        System.out.println(getName() + " была рядом с " + subject);
        setLocation(flowerBed.getName());
    }

    Ben ben = new Ben("Бен Уэзерстафф", "старый");
    public void remember() {
        String subject = ben.getAge() + " " + ben.getName() + " " + ben.say();
        System.out.println(getName() + " вспомнила:" + subject);
    }


    Garden.GardenPlants plant = new Garden.GardenPlants("побеги", "нежно-зеленые", "маленькие", "");
    public void lookAt() {
        String subject = plant.getSize() + " " + plant.getColour() + " " + plant.getName();
        setStatus(Status.SQUATTEDDOWN);
        System.out.println(getName() + " " + status + " и стала разглядывать " + subject);

    }

    class Flowers {
        private  String name;
        private String placeOfGrowth;

        public Flowers(String name) {
            this.name = name;

        }
        FlowerBed flowerBed = new FlowerBed("клумба ", " ", " ");
        public String grow() {
            String placeOfGrowth = flowerBed.getName();
            setPlaceOfGrowth(flowerBed.getName());
            String sentence = getName() + " растут в " + placeOfGrowth;
            return sentence;

        }

        public String getName() {
            return name;
        }

        public void setPlaceOfGrowth(String placeOfGrowth) {
            this.placeOfGrowth = placeOfGrowth;
        }
    }

    Flowers flowers = new Flowers("цветы");


    @Override
    public String say() {
        String sentence = flowers.grow();
        String phrase = getName() + " прошептала: " + sentence;
        setStatus(Status.MOUTHMOVEMENT);
        return phrase;
    }
    class OtherPlants {
        private String name;
        OtherPlants(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        Garden garden = new Garden(" сад ");
        public String grow() {
            String place = garden.getName();
            String phrase = getName() + " растут в " + place;
            return phrase;
        }
    }
    OtherPlants otherPlants = new OtherPlants(" другие растения");


    public void thinkWithHope() {
        setCondition(Condition.HOPE);
        String phrase = otherPlants.grow();
        System.out.println(getName()+ " подумала с надеждой: " + phrase + "?");
    }



    Garden.GardenPlants gardenPlants = new Garden.GardenPlants(" ростки ", " зеленые", "", " ");
    public void notice() {
        setCondition(Condition.HAPPY);
        System.out.println(getName() + " " + condition + ". " + getName() + " заметила " + gardenPlants.getColour() + " " + gardenPlants.getName());

    }
    Garden garden = new Garden("Сад");

    public void sayWithWorry() {
        setCondition(Condition.WORRY);
        System.out.println(getName() + " " + condition + " и сказала: " + garden.live());
    }
    Garden.GardenPlants grass = new Garden.GardenPlants(" трава", " ", "", " слишком густая");

    public void seem() {
        setCondition(Condition.UNCERTAINTY);
        String object = grass.getName();
        String description = grass.getStatus();
        System.out.println(getName() + " почувствовала " + condition + "." + getName() + " показалось, что " + object + " " + description);

    }

    //FlowerBed flowerBed = new FlowerBed("клумбы", "", "старые");

    public void goToGardenLandscape() {
        setHappiness(0.5);
        double parameter = Math.random();
        double a = 1/3f;
        double b = 2/3f;
        while ( happiness > 0 && happiness < 1) {

            if (parameter < a) {
                happiness +=0.08;
                setLocation(flowerBed.getName() + flowerBed.getStatus());
                System.out.println(getName() + " подошла к " + getLocation());
                String str = String.format("%.0f", happiness*100);
                System.out.println("Счастье " + getName() + " увеличилось на 8% и теперь равно:" + str + "%");
            }
            if (parameter >= a && parameter<b) {
                happiness += 0.04;
                setLocation("заросшие лужайки");
                System.out.println(getName() + " подошла к " + getLocation());
                String str = String.format("%.0f", happiness*100);
                System.out.println("Счастье " + getName() + " увеличилось на 4% и теперь равно:" + str + "%");

            }
            if (parameter>= b) {
                happiness -= 0.06;
                setLocation(" края дорожек");
                System.out.println(getName() + " подошла к "+ getLocation());
                String str = String.format("%.0f", happiness*100);
                System.out.println("Счастье " + getName() + " уменьшилось на 6% и теперь равно:" + str + "%");
            }

        }
    }



    public void takeCareOfGarden() {
       if (knowledge < 0.6) {
            setCondition(Condition.NOTENOUGHKNOWLEDGE);
            System.out.println("У " + getName() + " " + condition + ", чтобы ухаживать за " + garden.getName());
        } else {
           System.out.println(getName() + "умеет ухаживать за " + garden.getName());
       }

    }


    public void weed() {
        class Weed {
            private String name;

            public String getName() {
                return name;
            }
            public Weed(String name) {
                this.name =name;
            }
        }
        Weed weed =new Weed("Сорняк");
        int numberOfFlowers = 1;
        double a = 1;
        double b = Math.random();
        System.out.println(getName() + " подошла к " + weed.getName());
        System.out.println(getName() + " вырвала " + numberOfFlowers + " " + weed.getName());
        while (a > b) {
            System.out.println(getName() + " подошла к следующему " + weed.getName());
            numberOfFlowers++;
            System.out.println(getName() + " вырвала " + numberOfFlowers + " " + weed.getName());
            a = Math.random();
            b = Math.random();
        }
        System.out.println(getName() + " закончила прополку!");
        setStatus(Status.FINISHED);
    }

    public void canToWeed() {
        setAge(12);
        try {
            AgeCheck.checkingTheAgeValue(getAge());
            System.out.println("Хоть " + getName() + " было всего " + getAge() + " лет, она смогла прополоть всё!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void lookAt2() {
        String object = flowerBed.getName();
        setCondition(Condition.ENJOY);
        System.out.println(getName() + " разглядывала " + object + " и " + condition);
    }

    Garden.GardenPlants sprout = new Garden.GardenPlants("ростки", " ", " ", " будет легче");

    public void understand() {
        String subject = sprout.getName() + sprout.getStatus();
        setCondition(Condition.REALISE);
        System.out.println(getName() + " " + condition + ", что " + subject);
    }

    FlowerBed flowerBed2 = new FlowerBed("клумба ", "", "вторая");

    public void lookAt3() {
        String object = flowerBed2.getStatus() + " " + flowerBed2.getName();
        setStatus(Status.TURNEDAROUND);
        System.out.println(getName() + " " + status + " и увидела "+ object);
    }



    public void goToTheFlowerBed() {
        System.out.println(getName() + " подошла к первой " + flowerBed.getName() + " и начала полоть ");
        setHappiness(0);
        double a = Math.random();
        double b = Math.random();
        double c;
        while (happiness < 1) {
            System.out.println(getName() + " подошла к слудующей " + flowerBed.getName() + " прополола её");
            c = Math.abs((a-b)/2);
            happiness += c;
            String str1 = String.format("%.0f", happiness*100);
            String str2 = String.format("%.0f", c*100);
            System.out.println("Счастье " + getName() + " увеличилось на " + str2 + "% и теперь равно: " + str1 + "%");
            a = Math.random();
            b = Math.random();


        }
        String str = String.format("%.0f", happiness*100);
        System.out.println(getName() + " счастлива на все " + str + "%, ведь она прополола все клумбы");
        }


    Garden.GardenPlants plants2 = new Garden.GardenPlants("ростки", " зеленые", " "," с трудом");
    public void pity() {
        setCondition(Condition.SYMPATHIZE);
        System.out.println(getName() + " " + condition + "к " + plants2.grow2() );
    }

    public void help() {
        String object = gardenPlants.getColour() + gardenPlants.getName();
        setCondition(Condition.HELPFUL);
        System.out.println( getName() + " "+ condition+ " " + object);
    }

    class Stick {
        private String status;
        private String name;
       public Stick(String name, String status) {
           this.status = status;
           this.name = name;
       }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }
    }
    Stick stick = new Stick("палка", " с острым концом");
    Earth earth = new Earth(" ", "земля");

    public void find() {
        String object = stick.getName() + stick.getStatus();
        System.out.println(getName() + " отыскала " + object);
    }

    public void dig() {
        String subject = stick.getName();
        String object = earth.getName();
        System.out.println(getName() + " взяла " + subject + " и подкопала " + object);

    }

    public void takeOffClothes() {
        setCondition(Condition.TOBEHOT);
        setMarysThings(MarysThings.COAT);
        System.out.println(getName() + " " + condition + " и " + getName() + " сбросила сначала " + marysThings);

        setMarysThings(MarysThings.HAT);
        System.out.println("Дальше " + getName() + " сбросила " + marysThings);


    }

    public void watchFromAfar (Garden.GardenPlants plantOne, Garden.GardenPlants plantTwo) {
        if (plantOne.hashCode() != plantTwo.hashCode()) {
            System.out.println("Издалека " + getName() + " показалось, что она видит разные растения");
        } else  {
            System.out.println("Издалека " + getName() + " показалось, что она видит одинаковые растения");
        }
    }

    public void findPlants(Garden.GardenPlants plantOne, Garden.GardenPlants plantTwo) {
        if (plantOne.equals(plantTwo)) {
            System.out.println(getName() + " нашла одинаковые растения!");
        } else {
            System.out.println(getName() + " нашла разные растения");
        }
    }


    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
