package countNumber;

public class Count implements Runnable {
    private Thread myThread;
    public Count(){
        myThread = new Thread(this, "My Thread");
        System.out.println("My Thread "+ myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }
    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                System.out.println("printing the count"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Main thread Stopped");
    }
}
