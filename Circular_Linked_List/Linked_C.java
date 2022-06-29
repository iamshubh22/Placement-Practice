public class Linked_C {
    public Node head;
    public Node tail;
    public int size;
    
    public Node Create(int value)
    {
        head = new Node();
        Node n = new Node();
        n.value=value;
        n.next=n;
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
            tail.next=n;
        }
        else if(location>=size)
        {
            tail.next=n;
            tail=n;
            tail.next=head;
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
            n.next=temp.next;
            temp.next=n;
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
            tail.next=head;
            size--;
            if(size==0)
            {
                tail=null;
                head.next=null;
                head=null;
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
                head.next=null;
                head=tail=null;
                size--;
                return;
            }
            temp.next=head;
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
        tail.next=null;
        tail=null;
    }

}
