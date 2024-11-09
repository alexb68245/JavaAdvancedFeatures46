package inheritance_polymorphism;

public class Lion extends Animal{

    public Lion(String name){
        super(name);
    }

    @Override
    protected String getSound() {
        return "Wrrr";
    }
}
