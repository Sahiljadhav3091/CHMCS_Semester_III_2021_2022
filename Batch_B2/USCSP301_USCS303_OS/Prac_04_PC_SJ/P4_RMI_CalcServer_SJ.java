//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

import java.net.*;
import java.rmi.*;
public class P4_RMI_CalcServer_SJ
{
        public static void main(String args[])
	{
	    try
	      {
                 P4_RMI_CalcServerImpl_SJ csi = new P4_RMI_CalcServerImpl_SJ();
                 Naming.rebind( "CSBO" , csi );
                        }//try ends
                        catch(Exception e){
System.out.println( "Exception : " + e);
                        }//catch ends
                 }//main ends
}//class end