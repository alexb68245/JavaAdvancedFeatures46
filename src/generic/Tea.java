package generic;

public class Tea {

    private String type;

    public Tea(String type) {
        this.type = type;
    }

    public void printType(){
        System.out.println("Tea type: " + type);
    }
}
