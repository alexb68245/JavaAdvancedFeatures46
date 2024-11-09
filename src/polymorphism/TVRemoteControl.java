package polymorphism;

public class TVRemoteControl implements RemoteControl {
    @Override
    public void enable(boolean enable) {
        if (enable) {
            System.out.println("TV is on");
        }else {
            System.out.println("TV is off");
        }
    }
}
