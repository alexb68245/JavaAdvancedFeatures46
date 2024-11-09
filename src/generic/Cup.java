package generic;

public class Cup<T>{

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public Cup(){}

    public void setLiquid(T liquid) {
        this.liquid = liquid;
    }

    public void drink(){
        System.out.println("You are drinking " + liquid);
    }

    public <T> Cup<T> getLiquid(){
        return new Cup<T>();
    }


}
