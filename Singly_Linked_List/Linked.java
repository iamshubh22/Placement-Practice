public class Linked
{
    public Node head;
    public Node tail;
    public int size;
    
    public Node Create(int value)
    {
        head = new Node();
        Node n = new Node();
        n.next=null;
        n.value=value;
        head=n;
        tail=n;
        size=1;
        return head;
    }

    public void insert(int value,int location)
    {
        Node n =new Node();
        n.value=value;
        if(head==null)
        {
            Create(value);
            return;
        }
        else if(location==0)
        {
            n.next=head;
            head=n;
        }
        else if(location>=size)
        {
            n.next=null;
            tail.next=n;
            tail=n;
        }
        else
        {
            Node temp =head;
            int index=0;
            while(index<location-1)
            {
                temp =temp.next;
                index++;
            }
            Node nextN = temp.next;
            temp.next=n;
            n.next=nextN;
        }
        size++;
    }

    public void traverse()
    {
        if(head==null)
        {
            System.out.println("Not exist");
        }
        else
        {
            Node temp =head;
            for(int i=0;i<size;i++)
            {
                System.out.print(temp.value);
            if(i!=size)
            {
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
    System.out.println();
    }

    public boolean search(int value)
    {
        if(head!=null)
        {
            Node temp =head;
            for(int i=0;i<size;i++)
            {
                if(temp.value==value)
                {
                    System.out.println(i);
                    return true;
                }
                temp=temp.next;
            }
        }
        System.out.println("not found");
        return false;
    }

    public void delete(int location)
    {
        if(head==null)
        {
            System.out.println("Not Exist");
            return;
        }
        else if(location==0)
        {
            head=head.next;
            size--;
            if(size==0)
            {
                tail=null;
            }
        }
        else if(location>=size)
        {
            Node temp = head;
            for(int i=0;i<size;i++)
            {
                temp=temp.next;
            }
            if(temp==head)
            {
                head=tail=null;
                size--;
                return;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        else
        {
            Node temp = head;
            for(int i=0;i<location-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

    public void delete_entire()
    {
        head=null;
        tail=null;
    }

    
}