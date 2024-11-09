package inheritance_polymorphism;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected String getName(){
        return name;
    }

    protected abstract String getSound();
}
