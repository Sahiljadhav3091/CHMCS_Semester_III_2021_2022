//Name:sahil jadhav
//Batch:B2
//PRN:2020016400783091
//Date: 26 Aug,2021
//Prac-07: SYNCHRONIZATION

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.*;

class P7_Q3_BarberShop_SJ{
public static void main(String[] args)
{
    AtomicInteger spaces = new AtomicInteger(15);
    final Semaphore barbers = new Semaphore(3, true);
    final Semaphore customers = new Semaphore(0, true);
    ExecutorService openUp = Executors.newFixedThreadPool(3);
    P7_Q3_Barber_SJ[] employees = new P7_Q3_Barber_SJ[3];
    System.out.println("Opening up shop");
    for(int i = 0; i < 3; i++){
        employees[i] = new P7_Q3_Barber_SJ(spaces, barbers, customers);
        openUp.execute(employees[i]);
    }
    while(true)
    {
        try{    
            Thread.sleep(ThreadLocalRandom.current().nextInt(100, 1000+100)); //Sleep until next person gets in
        }
        catch(InterruptedException e){}
        System.out.println("Customer walks in");
        if(spaces.get() >= 0){
            new Thread(new P7_Q3_Customer_SJ(spaces, barbers,customers)).start();
        }
        else{
            System.out.println("Customer walks out, as no seats are available");
        }
    }//while ends
    }//main ends
}//P7_Q3_BarberShop_SJ class ends