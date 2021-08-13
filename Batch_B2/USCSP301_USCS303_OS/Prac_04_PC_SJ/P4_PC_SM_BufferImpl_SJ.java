//Name: Sahil Jadhav
//Batch No:B2
//PRN:2020016400783091
//Date:06-08-2021

public class P4_PC_SM_BufferImpl_SJ implements P4_PC_SM_Buffer_SJ
{
	private static final int BUFFER_SIZE = 5;
	private String[] elements;
	private int in,out,count;

public P4_PC_SM_BufferImpl_SJ()
{

	count = 0;
	in = 0;
	out = 0;
	elements = new String[BUFFER_SIZE];
}

public void insert(String item)
{
	while(count==BUFFER_SIZE);
	
	elements[in] = item;
	in = (in + 1)%BUFFER_SIZE;
	++count;
	System.out.println("Item Produced " + item + " at position " + in + " having total items " + count);
}
public String remove()
{
	String item;
	while(count==0);
	
	item = elements[out];
	out = (out + 1)%BUFFER_SIZE;
	--count;
	System.out.println("Item Consumed " + item + " from position " + out + " remaining total items " + count);
		return item;
	}
}
 