import Characters.*;
import enums.*;
import garden.FlowerBed;
import garden.Garden;
import garden.GardenLandscape;
import garden.GardenRoads;
import interfaces.Iplantable;

public class Main {
    public static void main(String[] args) {
        Mary mary = new Mary("Мэри");
        mary.actionWithJumpers(75, "рука");

        Garden garden = new Garden("Сад");
        //garden.consistOnLeaves();

        mary.remember(MarysThings.JUMPERS);
        mary.jump();
        mary.watch(95);
        mary.watch(60);

        GardenRoads gardenRoads = new GardenRoads("дорожки", "");
        gardenRoads.getCaught("Поначалу", "Мэри");

        mary.seeSomething("Потом");
        mary.stop();
        mary.beNextTo();

        Garden.GardenPlants plant = new Garden.GardenPlants("побеги", "нежно-зеленые", "Маленькие", "");
        plant.grow1();

        mary.remember();
        Ben ben = new Ben("Бен", "");
        ben.canPlant();
        mary.lookAt();
        mary.say();
        mary.breath(25);
        mary.thinkWithHope();
        mary.actionWithJumpers(45, "");

        mary.goToGardenLandscape();

        Iplantable craven = new Woman("Крейвен") {
        };
        craven.canPlant();

        mary.notice();
        mary.sayWithWorry();
        mary.seem();
        mary.takeCareOfGarden();
        mary.pity();
        mary.help();
        mary.find();
        mary.dig();

        mary.weed();
        mary.canToWeed();

        mary.lookAt2();
        mary.understand();
        mary.lookAt3();
        mary.breath(98);

        mary.goToTheFlowerBed();

        mary.takeOffClothes();



        // Mary mary = new Mary("Мэри");
        //mary.whisper();
        //mary.breath(45);
        //mary.thinkWithHope();
        //mary.notice();
        /*
        mary.seem();
        mary.method1();
        mary.weed();
        mary.takeCareOfGarden();

        Garden.GardenPlants gardenPlants = new Garden.GardenPlants("побеги", "нежно-зеленые", "маленькие", " ");
        gardenPlants.grow1();

        mary.pity();
        mary.takeOffClothes();

        Garden garden = new Garden("Сад");
        mary.say();
        gardenPlants.blossom();
        mary.goToTheFlowerBed();
        Garden.GardenPlants plantOne = new Garden.GardenPlants("цветок", "желтый", "большой", "");
        Garden.GardenPlants plantTwo = new Garden.GardenPlants("цветок", "желтый", "большой", "");
        mary.watchFromAfar(plantOne, plantTwo);
        mary.findPlants(plantOne, plantTwo);



       // Garden garden = new Garden("Сад");
       // garden.method();
        /*
        GardenRoads gardenRoads = new GardenRoads("дорожки", " ", "густо затянутые травой");
        mary.actionWithJumpers(70, "руку");
        //mary.wander("саду", "немного");
        mary.remember(2);
        mary.jump();
        mary.watch(95);
        mary.watch(50);
        gardenRoads.getCaught("дорожки", "Поначалу", "Мэри");
       // mary.seeSomething("Потом", "", "");

         */



    }


}