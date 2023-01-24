package garden;


public class SummerHouse extends GardenLandscape {
    private String status;
    public SummerHouse(String name, String size, String status) {
        super(name, size);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }


}
