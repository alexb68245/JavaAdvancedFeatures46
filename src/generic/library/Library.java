package generic.library;

public class Library<T> {

    private T typeOfMedia;

    public Library(T typeOfMedia) {
        this.typeOfMedia = typeOfMedia;
    }

    public void printName(String name){
        System.out.println(name);
    }
}
