public class CircularD {
    Node head;
    Node tail;
    int size;

    public Node Create(int value)
    {
        head = new Node();
        Node n = new Node();
        n.value=value;
        n.next=n;
        n.prev=n;
        head=n;
        tail=n;
        size=1;
        return head;
    }

    public void insert(int nodeValue,int location){
        Node node = new Node();
        node.value=nodeValue;
        if(head==null){
            Create(nodeValue);
        }else if(location==0){
            node.next=head;
            node.prev=tail;
            head.prev=node;
            head=node;
        }else if(location>=size){
            node.prev=tail;
            node.next=head;
            head.prev=node;
            tail.next=node;
            tail=node;
        }else {
            int index=0;
            Node temp =head;
            while(index<location-1){
                temp=temp.next;
                index++;
            }
            node.prev=temp;
            node.next=temp.next;
            temp.next=node;
            node.next.prev=node;
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

    public void Rtraverse()
    {
        if(head==null)
        {
            System.out.println("Not exist");
        }
        else
        {
            Node temp =tail;
            for(int i=0;i<size;i++)
            {
                System.out.print(temp.value);
            if(i!=size)
            {
                System.out.print("->");
            }
            temp=temp.prev;
        }
    }
    System.out.println();
    }

    public boolean Search(int value)
    {
        if(head!=null)
        {
            Node temp=head;
            for(int i=0;i<size;i++)
            {
                if(temp.value==value)
                {
                    System.out.println("found value");
                    return true;
                }
                temp=temp.next;
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public void delete(int location){
        if(head==null){
            System.out.println("DLL not exist");
            return;
        }else if(location==0)
        {
            if(size==1){
                head=null;
                head.prev=null;
                head.next=null;
                tail=null;
                size--;
                return;
            }else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
                size--;
            }
        }else if(location>=size){
            if(size==1){
                head.next=null;
                head.prev=null;
                head=null;
                tail=null;
                size--;
                return;
        }else{
            tail=tail.prev;
            tail.next=head;;
            head.prev=tail;
            size--;
        }
    }else{
        Node temp=head;
        for(int i=0;i<size;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;
    
    }
    
    }
    public void deleteE(){
        Node temp=head;
        for(int i=0;i<size;i++){
            temp.prev=null;
            temp=temp.next;
        }
        head=null;
        tail=null;
        System.out.println("Deleted Completed DOUBLY LINKED LIST Successfully");
    
    }
    }
