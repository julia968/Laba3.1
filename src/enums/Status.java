package enums;

public enum Status {

    STAY("стоит"),
    SQUATTEDDOWN("опустилась на корточки"),
    MOUTHMOVEMENT("двигает ртом"),
    BOWEDDOWN("склонилась");



    String tittle;

    Status(String tittle) {
        this.tittle = tittle;
    }

}
