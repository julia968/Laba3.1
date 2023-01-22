package garden;

import Characters.Mary;

public class GardenRoads extends GardenLandscape{

    private String status;
    public GardenRoads(String name, String size, String status) {
        super(name, size);
        this.status = status;
    }
    GardenLandscape gardenLandscape= new GardenLandscape("дорожки", "");
    public void getCaught(String name, String time, String subject) {
        System.out.println(time + " " + subject + " попадались " + name + ", " + status);
    }
}
