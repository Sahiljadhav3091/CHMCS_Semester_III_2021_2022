//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

import java.rmi.*;
import java.rmi.server.*;
public class P4_RMI_CalcServerImpl_SJ extends UnicastRemoteObject implements P4_RMI_CalcServerIntf_SJ{
	public P4_RMI_CalcServerImpl_SJ()throws RemoteException{

	}
	public int add(int a,int b)throws RemoteException
	{
		return a + b;
	}
	public int subtract(int a,int b)throws RemoteException
	{
		return a - b;
	}
	public int multiply(int a,int b)throws RemoteException
	{
		return a * b;
	}
	public int divide(int a,int b)throws RemoteException
	{
		return a / b;
	}
}