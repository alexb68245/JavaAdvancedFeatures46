package inheritance_polymorphism;

public class Student extends Person{

    Person person = new Person("name", 18);
    public Student(String name, int age) {
        super(name, age);
    }



    public String getStudentDetails(){
        return person.getPersonsDetails(person);
    }
}
