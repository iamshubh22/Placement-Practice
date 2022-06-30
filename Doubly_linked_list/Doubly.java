public class Doubly {
    Node head;
    Node tail;
    int size;

    public Node Create(int value)
    {
        head = new Node();
        Node n = new Node();
        n.value=value;
        n.next=null;
        n.prev=null;
        head=n;
        tail=n;
        size=1;
        return head;
    }

    public void Insert(int location,int value)
    {
        Node n =new Node();
        n.value=value;
        if(head==null)
        {
            Create(value);
        }
        else if(location==0)
        {
            n.prev=null;
            n.next=head;
            n.next.prev=n;
            head=n;
        }
        else if(location>=size)
        {
            n.next=null;
            n.prev=tail;
            tail=n;
            tail.next=n;
        }
        else
        {
            Node temp=head;
            int index=0;
            while(index<location-1)
            {
                temp=temp.next;
                index++;
            }
            n.next=temp.next;
            n.prev=temp;
            temp.next=n;
            n.next.prev=n;
        }
        size++;
    }
       
}
