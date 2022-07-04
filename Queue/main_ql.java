public class main_ql {
    public static void main(String[] args)
	{
		queue_l a=new queue_l();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		a.display();
		a.dequeue();
		a.display();
		a.peek();	
	}

}
