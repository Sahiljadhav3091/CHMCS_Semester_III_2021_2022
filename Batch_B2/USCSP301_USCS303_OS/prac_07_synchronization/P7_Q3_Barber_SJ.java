//Name:sahil jadhav
//Batch:B2
//PRN:2020016400783091
//Date: 26 Aug,2021
//Prac-07: SYNCHRONIZATION

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class P7_Q3_Barber_SJ  implements Runnable
{
    private AtomicInteger spaces;
    private Semaphore bavailable;
    private Semaphore cavailable;
    private Random ran = new Random();
    public P7_Q3_Barber_SJ(AtomicInteger spaces, Semaphore bavailable, Semaphore cavailable){
        this.spaces = spaces;
        this.bavailable = bavailable;
        this.cavailable = cavailable;
    }
    @Override
    public void run(){
        while(true){
            try{
                cavailable.acquire();
                //Space freed up in waiting area
                System.out.println("Customer getting hair cut");
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,10000+1000));
                //Sleep to imitate length of time to cut hair
                System.out.println("Customer pays and leaves");
                bavailable.release();
            }catch(InterruptedException e){}
        }//while ends
    }//run ends
}//class ends