//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

public class P4_PC_SM_SJ
{

	public static void main(String[] args){
		P4_PC_SM_BufferImpl_SJ  bufobj = new  P4_PC_SM_BufferImpl_SJ();

		System.out.println("\n================PRODUCER producing the ITEMS=================\n");
		bufobj.insert("Name: Sahil Jadhav");
		bufobj.insert("CHMCS:  Batch - B2");
		bufobj.insert("PRN: 2020016400783091");
		bufobj.insert("USCSP301 - USCS303:0S Practical - P4");

		System.out.println("\n==============CONSUMER consuming the ITEMS================\n");
		
		System.out.println(bufobj.remove());
		System.out.println(bufobj.remove());
		System.out.println(bufobj.remove());
		System.out.println(bufobj.remove());
       }
}