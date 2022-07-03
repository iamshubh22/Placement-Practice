public class stack_l {
    private class Node
    {
    int data;
    Node link;
    }
    Node top;
    
    stack_l()
    {
    this.top=null;
    }
    
    public void push(int x)
    {
    Node temp=new Node();
    temp.data=x;
    temp.link=top;
    top=temp;
    }
    public boolean isEmpty()
    {
        return top==null;
    }
    public int peek()
    {
        if(!isEmpty())
        {
            return top.data;
        }
        else
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return ;
        }
        top=(top).link;
    }
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
           
        }
        else {
            Node temp = top;
            while (temp != null) {
    
                System.out.printf("%d->", temp.data);
    
                temp = temp.link;
            }
        }
    }
    }