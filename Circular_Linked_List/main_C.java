public class main_C {
    public static void main(String[] args) {
        Linked_C obj =new Linked_C();
        obj.Create(5);
        System.out.println(obj.head.value);
        obj.insert(11, 0);
        obj.insert(12, 7);
        obj.insert(13, 3);
        System.out.println(obj.head.value);

        obj.traverse();
        obj.search(12);        
        obj.delete(2);
        obj.traverse();
        obj.delete_entire();
        obj.traverse();
        
    }
    
}

