import java.util.Random;

public class StopWatch {
    private  long startTime;
    private long endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();

    }
    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }

    public void start(){
         this.startTime=System.currentTimeMillis() ;
    }
    public void stop() {
        this.endTime= System.currentTimeMillis() ;
    }

    public long elapsedTime() {
        return this.endTime - this.startTime;
    }
}
class main{
    public static void main(String[] args) {
        int size = 100000;
        int [] array = new int[size];
        Random random = new Random();
        for(int i=0;i<size;i++){
            array[i] = random.nextInt(size);
        }
        StopWatch sw = new StopWatch();
        System.out.println("sorting");
        sw.start();
        selectionSort(array);
        sw.stop();
        System.out.println("sorting" + sw.elapsedTime() +"ms");

    }
    public static void selectionSort(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
