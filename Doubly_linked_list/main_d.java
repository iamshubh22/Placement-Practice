public class main_d {
    public static void main(String [] args)
    {
        Doubly obj =new Doubly();
        obj.Create(5);
        System.out.println(obj.head.value);
        obj.Insert(0, 11);
        obj.Insert(4, 18);
        obj.Insert(2, 19);
        System.out.println(obj.head.value);
    }
    
}
