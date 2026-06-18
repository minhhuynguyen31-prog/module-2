package countNumber;

import org.w3c.dom.css.Counter;

public class Main {
    public static void main(String[] args) {
        Count counter = new Count();
        try{
            while(counter.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread Stopped");

    }
}
