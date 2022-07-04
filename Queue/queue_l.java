public class queue_l {
	
	public class Node
	{
		int data;
		Node next;
	}
	Node front =null;
	Node rear =null;
	
	@SuppressWarnings("unused")
	public void enqueue(int value)
	{
		Node temp = new Node();
		if(temp==null)
		{
			System.out.println("queue is currently empty");
			return;
		}
		else
		{
			temp.data=value;
			temp.next=null;
			if(front ==null)
			{
				front =temp;
				rear= temp;
			}
			else
			{
				rear.next=temp;
				rear=temp;
			}
		}
	}
	
	public void dequeue()
	{
		if(front==null)
		{
			System.out.println("queue empty");
		}
		else if(front ==rear)
		{
			System.out.println(front.data);
			rear=front=null;
		}
		else
		{
			System.out.println(front.data);
			front=front.next;
		}				
	}
	public void peek()
	{
		System.out.println(front.data);
	}
	public void display()
	{
		if(front==null)
		{
			System.out.println("queue is empty");
		}
		else
		{
			Node temp = front;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
}
