//Name:sahil jadhav
//Batch:B2
//PRN:2020016400783091
//Date: 26 Aug,2021
//Prac-07: SYNCHRONIZATION
import java.util.Random;
public class P7_Q1_Consumer_SJ implements Runnable
{
     private final static Random generator = new Random();
     private final P7_Q1_Buffer_SJ sharedLocation;
     public P7_Q1_Consumer_SJ(P7_Q1_Buffer_SJ shared)
     {
            sharedLocation=shared;
     }
public void  run()
 {
        int sum=0;
        for(int count = 1;count <= 10;count++)
        {
         try{
                      Thread.sleep(generator.nextInt(3000));
                        sum += sharedLocation.get();
               }
    catch(InterruptedException e)
    {
                         e.printStackTrace();
                   }
}
        System.out.printf("\n%s  %d\n%s\n","Consumer read values totaling",sum,"Terminating Consumer");
 }//run() ends
}//Consumer class ends