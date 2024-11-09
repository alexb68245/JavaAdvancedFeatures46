//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.exampleMethod();
        System.out.println(interfaceExample.stringMethod());
        System.out.println(interfaceExample.firstMethod().smth);
        System.out.println(interfaceExample.getUserNameWhenIdIs(5));

    }

    public void someMethod(){
        First firstObject = new First(" ", "");
        First.FirstInner firstInner = firstObject.new FirstInner();
    }
}