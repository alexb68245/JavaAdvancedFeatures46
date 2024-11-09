package polymorphism;

public class ACRemoteControl implements RemoteControl{

    @Override
    public void enable(boolean enable){
        /* if(enable){
            System.out.println("A/C is on");
        }else {
            System.out.println("A/C is off");
        }
         */
        System.out.println("A/C enabled: " + enable);
    }
}
