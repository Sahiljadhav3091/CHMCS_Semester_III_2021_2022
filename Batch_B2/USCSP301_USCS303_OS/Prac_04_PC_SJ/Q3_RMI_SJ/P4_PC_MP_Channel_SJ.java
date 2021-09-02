//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

public interface P4_PC_MP_Channel_SJ<E>
{
	// Send a message to the channel 
	public void send(E item);

	// Receive a message from the channel
	public E receive();
}// interface ends
