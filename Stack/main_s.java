public class main_s {
    public static void main(String [] args)
    {
        stack s = new stack(5);
        s.isEmpty();
        s.isFull();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();
        s.peek();
        s.display();
        s.delete();

    }
}
