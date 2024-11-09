public class First extends AbstractExample{
    public String name;

    public First(String name, String smth) {
        super(smth);
        this.name = name;
    }
    @Override
    public void doSomething() {
        System.out.println("Hello " + name + "!");
    }

    static class FirstNestedStatic{
        public int nestedStaticField;
    }

    class FirstInner{
        public int innerField;
    }
}
