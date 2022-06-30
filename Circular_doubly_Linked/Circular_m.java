public class Circular_m {
    public static void main(String [] args)
    {
        Doubly obj =new Doubly();
        obj.Create(5);
        System.out.println(obj.head.value);
        obj.insert(0, 0);
        obj.insert(7, 18);
        obj.insert(3, 19);
        System.out.println(obj.head.value);
        obj.traverse();
        obj.Rtraverse();
        obj.Search(0);

        obj.delete(0);
        obj.traverse();
        obj.deleteE();
        obj.traverse();
}
}
