public class InterfaceExample implements ExampleInterface {
    @Override
    public void exampleMethod(){
        System.out.println("Example Method");
    }

    @Override
    public String stringMethod() {
        return "String Method";
    }

    @Override
    public First firstMethod() {
        return new First("name", "hello");
    }

    @Override
    public String getUserNameWhenIdIs(int id) {
        return "User name when id is " + id;
    }
}
