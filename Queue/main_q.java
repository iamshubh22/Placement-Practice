public class main_q {
    public static void main(String [] args)
    {
        queue q=new queue(5);
        q.isEmpty();
        q.isFull();
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(7);
        q.dequeue();
        q.peek();
        q.display();
        q.delete();
    }
}
