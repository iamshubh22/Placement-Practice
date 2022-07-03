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
            System.out.println("Stack Empty");
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
            System.out.println("Stack Full");
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
            arr[top+1]=value;
            top++;
            System.out.println("value inserted successfully");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        else
        {
            int tops=arr[top];
            top--;
            System.out.println("Value poped Successfully");
            return tops;
        }
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty");
            return -1;
        }
        else
        {
            System.out.println(arr[top]);
            return arr[top];
        }
    }

    public void delete()
    {
        arr=null;
        System.out.println("Stack is deleted successfully");
    }

    
}
