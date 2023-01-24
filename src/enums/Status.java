package enums;

public enum Status {
    SQUATTEDDOWN("опустилась на корточки"),
    MOUTHMOVEMENT("двигает ртом"),
    BOWEDDOWN("склонилась"),
    FINISHED("закончила"),
    WEED("принялась полоть"),
    TURNEDAROUND("повернулась");
    private String tittle;
    Status(String tittle) {
        this.tittle = tittle;
    }
    @Override
    public String toString() {
        return tittle;
    }

}
