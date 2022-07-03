public class queue {
    int [] arr;
    int f;
    int r;

    public queue(int size)
    {
        this.arr= new int[size];
        this.f=-1;
        this.r=-1;
        System.out.println("queue successfully created");
    }

    public boolean isFull()
    {
        if(r==arr.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        if(f==-1&&r==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insert(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else if(r==-1)
        {
            f++;
            arr[++r]=value;
            System.out.println("value successfully inserted");
        }
        else
        {
            r++;
            arr[++r]=value;
            System.out.println("value inserted successfully");
        }
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else if(r==f)
        {
            r=f=-1;
        }
        else
        {
            System.out.println(arr[f]);
            f++;
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            int result=arr[f];
            System.out.println(result);
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
        }
        else
        {
            int temp =f;
            for(int i=f;i<=r;i++)
            {
                System.out.println(arr[temp]);
                temp++;
            }
        }
    }

    public void delete()
    {
        arr=null;
        System.out.println("Deleted Successfully");
    }
}
