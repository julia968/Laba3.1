package garden;

import Characters.Mary;

public class GardenRoads extends GardenLandscape{

    private String status;
    public GardenRoads(String name, String size) {
        super(name, size);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // GardenLandscape gardenLandscape= new GardenLandscape("дорожки", "");
    public void getCaught(String time, String subject) {
        setStatus("густо затянутые травой");
        System.out.println(time + " " + subject + " попадались " + getName() + ", " + status);
    }
}
