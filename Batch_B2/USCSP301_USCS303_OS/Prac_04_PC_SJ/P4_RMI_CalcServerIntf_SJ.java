//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

import java.rmi.*;
public interface P4_RMI_CalcServerIntf_SJ extends Remote
{
	int add(int a, int b)throws RemoteException;
	int subtract(int a, int b)throws RemoteException;
	int multiply(int a, int b)throws RemoteException;
	int divide(int a, int b)throws RemoteException;
}//interface ends