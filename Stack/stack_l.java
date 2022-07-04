public class stack_l {
    private class Node
	{
		int data;
		Node next;
	}
	Node top =null;
	
	public void push(int value)
	{
		Node temp =new Node();
		temp.data=value;
		temp.next=top;
		top=temp;
	}
	
	public void pop()
	{
		if(top==null)
		{
			System.out.println("stack empty");
		}
		else
		{
			System.out.println(top.data);
			top=top.next;
		}
							
	}
	public void peek()
	{
		if(top==null)
		{
			System.out.println("stack empty");
		}
		else
		{
		System.out.println(top.data);
		}
		}
	public void display()
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			Node temp = top;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
}