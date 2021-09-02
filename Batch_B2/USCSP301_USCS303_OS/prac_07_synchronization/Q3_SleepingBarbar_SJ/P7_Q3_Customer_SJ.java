//Name:sahil jadhav
//Batch:B2
//PRN:2020016400783091
//Date: 26 Aug,2021
//Prac-07: SYNCHRONIZATION

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class P7_Q3_Customer_SJ implements Runnable
{
    private AtomicInteger spaces;
    private Semaphore bavailable;
    private Semaphore cavailable;
    private Random ran = new Random();
    public P7_Q3_Customer_SJ(AtomicInteger spaces, Semaphore bavailable, Semaphore cavailable){
        this.spaces = spaces;
        this.bavailable = bavailable;
        this.cavailable = cavailable;
    }
    @Override
    public void run(){
            try{
                cavailable.release();
                if(bavailable.hasQueuedThreads()){
                    spaces.decrementAndGet();
                    System.out.println("Customer in waiting area");
                    bavailable.acquire();
                    spaces.incrementAndGet();
                }
                else
                {
                    bavailable.acquire();
                }
            }catch(InterruptedException e){}
    }//run ends
}//P7_Q3_Customer_SJ class