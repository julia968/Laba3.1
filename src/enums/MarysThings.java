package enums;

public enum MarysThings {
    JUMPERS("прыгалки"),
    COAT("пальто"),
    HAT("шляпка");

    String title;
    MarysThings(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
