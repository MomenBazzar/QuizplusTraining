package reflection;

public abstract class Animal implements Eating {
    private String name;
    public static String CATEGORY = "domestic";

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected abstract String getSound();

}

