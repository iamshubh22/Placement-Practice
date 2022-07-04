public class stack {
    int [] arr;
    int top;

    public stack(int size)
    {
        this.arr= new int[size];
        this.top=-1;
        System.out.println("Stack created successfully"); 
    }

    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        if(top==arr.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top]=value;
            System.out.println("value inserted successfully");
        }
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");

        }
        else
        {
            System.out.println(arr[top]);
            top--;
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty");
        }
        else
        {
            System.out.println(arr[top]);
        }
    }

    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }

    public void delete()
    {
        arr=null;
        System.out.println("Stack is deleted successfully");
    }

    
}
