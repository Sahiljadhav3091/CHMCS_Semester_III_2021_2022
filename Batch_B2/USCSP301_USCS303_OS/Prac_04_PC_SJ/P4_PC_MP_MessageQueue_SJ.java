//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

import java.util.Vector;

public class P4_PC_MP_MessageQueue_SJ<E>  implements  P4_PC_MP_Channel_SJ<E>

{
	private Vector<E> queue;

	public P4_PC_MP_MessageQueue_SJ(){
	      queue = new Vector<E>();
     }
	// This implements a nonblocking send
	public void send(E item){
		queue.addElement(item);
     }// send() ends

	// This implements a nonblocking receive
	public E receive(){
		if(queue.size()==0)
			return null;
		else
			return queue.remove(0);
     }// receive() ends
}//class ends
