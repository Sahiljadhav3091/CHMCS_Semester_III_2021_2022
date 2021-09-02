//Name:sahil jadhav
//Batch:B2
//PRN:2020016400783091
//Date: 26 Aug,2021
//Prac-07: SYNCHRONIZATION
import java.util.concurrent.*;
public class P7_Q1_Test_SJ
{
     public static void main(String args[])
     {
                 ExecutorService application = Executors.newCachedThreadPool();
                 P7_Q1_CircularBuffer_SJ sharedLocation = new P7_Q1_CircularBuffer_SJ();
                 sharedLocation.displayState("Initial State");
                 application.execute(new P7_Q1_Producer_SJ(sharedLocation));
                 application.execute(new P7_Q1_Consumer_SJ(sharedLocation));
                   application.shutdown();
     }
}