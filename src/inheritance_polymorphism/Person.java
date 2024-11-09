package inheritance_polymorphism;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getPersonsDetails(Person person){
        return "Name: " + person.name + "\nAge: " + person.age + "\n";
    }
}
