package garden;

public class GardenLandscape extends Garden {
    private String size;

    public GardenLandscape(String name, String size) {
        super(name);
        this.size = size;
    }



    public String getSize() {
        return size;
    }



}