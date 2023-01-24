package garden;

public class GardenLandscape extends Garden {
    private String size;

    public GardenLandscape(String name, String size) {
        super(name);
        this.size = size;
    }

    boolean isOld = false;

    public void isOld() {
        isOld = true;
        System.out.println(getName() + "старый");
    }


    public String getSize() {
        return size;
    }



}