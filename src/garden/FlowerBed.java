package garden;

public class FlowerBed extends GardenLandscape{
    private String status;
    public FlowerBed(String name, String size, String status) {
        super(name, size);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
