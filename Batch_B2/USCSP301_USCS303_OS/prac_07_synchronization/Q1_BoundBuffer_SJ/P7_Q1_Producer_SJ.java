//Name:sahil jadhav
//Batch:B2
//PRN:2020016400783091
//Date: 26 Aug,2021
//Prac-07: SYNCHRONIZATION
import java.util.Random;
public class P7_Q1_Producer_SJ implements Runnable
{
     private final static Random generator=new Random();
     private final P7_Q1_Buffer_SJ sharedLocation;

     public P7_Q1_Producer_SJ(P7_Q1_Buffer_SJ shared)
     {
            sharedLocation=shared; 
     }
public void run()
{
    for(int count = 1;count <= 10;count++)
        {
             try{
                         Thread.sleep(generator.nextInt(3000));
                         sharedLocation.set(count);
                   }
    catch(InterruptedException e)
    {
                      e.printStackTrace();
         }
    }
    System.out.println("Producer done producing.Terminating Producer");
 }//run() ends
}//Producer class ends