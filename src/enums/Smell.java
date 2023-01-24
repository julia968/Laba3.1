package enums;

public enum Smell {
    EARTH("запах земли"),
    GRASS("запах травы");
    private String title;

    Smell(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

