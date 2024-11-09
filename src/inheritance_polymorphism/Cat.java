package inheritance_polymorphism;

public class Cat extends Animal {

    private String colour;

    public Cat(String name, String colour) {
        super(name);
        this.colour = colour;
    }

    @Override
    protected String getSound(){
        return "Meaw";
    }

    protected String getColour(){
        return colour;
    }
}
