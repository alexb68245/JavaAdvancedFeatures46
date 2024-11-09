package inheritance_polymorphism;

public class MainInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba");
        System.out.println(lion.getName()+ " makes sound: "+lion.getSound());
        Cat cat = new Cat("Pisika", "black");
        System.out.println(cat.getName()+ " is colour : " +cat.getColour() + " and makes sound: "+cat.getSound());

        Student student = new Student("StudentName", 20);
        System.out.println(student.getStudentDetails());
        System.out.println(student.getPersonsDetails(new Person("name", 30)));

    }
}
