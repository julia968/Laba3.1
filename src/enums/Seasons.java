package enums;

public enum Seasons {
    WINTER("зима"),
    SPRING("весна"),
    SUMMER("лето"),
    AUTUMN("осень");
    private String title;
    Seasons(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
