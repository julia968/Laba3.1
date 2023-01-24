package enums;

public enum Condition {
    HOPE("появилась надежда"),
    HAPPY("обрадовалась"),
    UNCERTAINTY( " неуверенность"),
    NOTENOUGHKNOWLEDGE("оказалось недостаточно знаний"),
    SYMPATHIZE("проявяляла сочувствие "),
    TOBEHOT("стало жарко"),
    WORRY("волновалась"),
    HELPFUL("захотела помочь "),
    ENJOY ("испытывала удовольствие"),
    REALISE("осознала");



    private String title;
    Condition(String title) {
        this.title = title;
    }




    @Override
    public String toString() {
        return title;
    }

}
