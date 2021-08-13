//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

import java.rmi.*;
public class P4_RMI_CalcClient_SJ
{
        public static void main(String args[])
          {
          try  {
                     String CSURL = "rmi://" + args[0] + "/CSBO";
	    P4_RMI_CalcServerIntf_SJ CSIntf = (P4_RMI_CalcServerIntf_SJ) Naming.lookup(CSURL);
                      System.out.println(" The first number is: " + args[1]);
                      int x = Integer.parseInt(args[1]);
                      System.out.println(" The second number is: " + args[2]);
                      int y = Integer.parseInt(args[2]);
                      System.out.println("-----------Arithematic Operation-------------");
	   	      System.out.println("Addition : " + x +  " + " + y + " = " + CSIntf.add(x , y));
                      System.out.println("Subtraction : " + x + " - " + y + " = " + CSIntf.subtract(x , y));
                      System.out.println("Multiplication : " + x +  " * " + y + " = " + CSIntf.multiply(x , y));
                      System.out.println("Division : " + x + " / " + y + " = " + CSIntf.divide(x , y));
                }//try ends
          catch(Exception e){
                      System.out.println("Exception : " + e);
          }//catch ends
        }//main ends
}//class ends