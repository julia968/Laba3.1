package garden;


public class SummerHouse extends GardenLandscape {
    private String status;
    public SummerHouse(String name, String size, String status) {
        super(name, size);
        this.status = status;
    }
    class Benhes {
        boolean madeOfStone = false;

        public void madeOfStone() {
            madeOfStone = true;
        }
    }

    public String getStatus() {
        return status;
    }


}
