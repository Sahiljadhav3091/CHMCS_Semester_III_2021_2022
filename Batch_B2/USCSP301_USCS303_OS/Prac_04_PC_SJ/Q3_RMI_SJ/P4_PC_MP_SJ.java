//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

import java.util.Date;
public class P4_PC_MP_SJ
{
	public static void main(String args[])
	{

	     P4_PC_MP_Channel_SJ<Date>  mailBox = new P4_PC_MP_MessageQueue_SJ<Date>();
		int i = 0;
	do
	{
		Date message = new Date();
		System.out.println("Producer produced- " + (i+1)+ " : " + message);
		mailBox.send(message);
		Date rightNow = mailBox.receive();
		if(rightNow!= null)
		{
			System.out.println("Consumer consumed -" + (i+1) + " : " + rightNow);
		}
		i++;
	}while(i<10);
      }
}