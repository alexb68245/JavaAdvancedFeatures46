package polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        TVRemoteControl tvRemoteControl = new TVRemoteControl();
        ACRemoteControl acRemoteControl = new ACRemoteControl();

        tvRemoteControl.enable(false);
        acRemoteControl.enable(true);
        tvRemoteControl.enable(true);
        acRemoteControl.enable(false);
    }
}
