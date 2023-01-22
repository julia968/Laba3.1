package Characters;

import enums.MarysThings;
import enums.Smell;
import enums.Status;
import garden.*;


public class Mary extends Character {
    int air;
    int interest;
    int energy;
    private Smell smell;
    private Status status;

    private String location;
    private MarysThings marysThings;

    public Mary(String name) {
        super(name);

    }
   
    

    public String getName() {
        return this.name;
    }

    public void breath(int air) {
        this.air = air;
        if (air <= 50) {
            setSmell(Smell.EARTH);
            Smell smell = Smell.EARTH;
            setStatus(Status.BOWEDDOWN);
            Status status = Status.BOWEDDOWN;
            System.out.println(name + " " + status + " и с удовольствием вдохнула" + smell);
        } else {
            System.out.println(name + "глубоко вздохнула");
        }
    }

    private void setSmell(Smell smell) {
        this.smell = smell;
    }
    private void setMarysThings (MarysThings marysThings) {
        this.marysThings = marysThings;
    }


    public void take(MarysThings marysThings) {
        setMarysThings(MarysThings.JUMPERS);
        System.out.println(name + " снова взялась за " + marysThings);
    }
    public void actionWithJumpers(int energy, String partOfBody, MarysThings marysThings) {
        setMarysThings(MarysThings.JUMPERS);
        this.energy = energy;
        if (energy <= 60) {
            System.out.println(name + " оставила в покое " + marysThings);
        } else {
            System.out.println(name + " перекинула " + marysThings + " через " + partOfBody);
        }
    }

    public void remember(MarysThings marysThings) {
        setMarysThings(MarysThings.JUMPERS);

        System.out.println(name + " вспомнила о "+ marysThings);

    }
    public void jump() {
        System.out.println(name+ " " + "решила скакать");
    }
    public void watch(int interest) {
        this.interest = interest;
        if(interest >= 90) {
            System.out.println("Если " + name  + " что-то заинтересует, то она остановится и разглядит");
        } else if (interest <90 ) {
            take(MarysThings.JUMPERS);
        }

    }
    SummerHouse twoGazebos = new SummerHouse("Две беседки", "", "с каменными скамьями");
    Vases vases = new Vases("вазами","", "покрытыми мхом");
    public void seeSomething(String time) {
        String firstSubject = twoGazebos.getName() + " " + twoGazebos.getStatus();
        String secondSubject = vases.getName() + " " + vases.getStatus();
        System.out.println(time + " " + name + " увидела " + firstSubject + " " + secondSubject);
    }
    SummerHouse secondAlcove = new SummerHouse("второй беседки", " ", " ");
    public void stop(String location, String subject) {
        subject = secondAlcove.getName();
        System.out.println(location + subject + name + "остановилась");
    }

    @Override
    public void canPlant() {
    }
    public void setLocation(String location) {
        this.location = location;
    }
    FlowerBed flowerBed = new FlowerBed("клумба", "большая", "цветочная");
    public void beNextTo(String subject) {
        subject = flowerBed.getSize() + " " + flowerBed.getStatus() + " " + flowerBed.getName();
        System.out.println(name + "была рядом с" + subject);
        setLocation(flowerBed.getName());
    }

    Ben ben = new Ben("Бен Уэзерстафф", "старый");
    public void remember() {
        String subject = ben.getAge() + " " + ben.getName() + " " + ben.say(getName(), "об этом", Status.MOUTHMOVEMENT);
        System.out.println(name + " вспомнила:" + subject);
    }


    Garden.GardenPlants plant = new Garden.GardenPlants("побеги", "нежно-зеленые", "маленькие");
    public void lookAt(String subject, Status status) {
        subject = plant.getSize() + " " + plant.getColour() + " " + plant.getName();
        setStatus(Status.SQUATTEDDOWN);
        System.out.println(name + status + " и стала разглядывать " + subject);

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
            System.out.println(sentence);
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



    public void say(String object, Status status) {
        String sentence = flowers.grow();
        System.out.println(name + " прошептала: " + sentence );
        setStatus(Status.MOUTHMOVEMENT);




    }


    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
