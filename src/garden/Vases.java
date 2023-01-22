package garden;

public class Vases extends GardenLandscape {
    private String status;
    public Vases(String name, String size, String status) {
        super(name, size);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}

