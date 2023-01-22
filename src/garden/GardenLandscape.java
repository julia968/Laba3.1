package garden;

public class GardenLandscape extends Garden {
    private String size;
    private String name;

    public GardenLandscape(String name, String size) {
        super(name);
        this.size = size;
    }

    boolean isOld = false;

    public void isOld() {
        isOld = true;
        System.out.println(this.name + "старый");
    }


    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

}