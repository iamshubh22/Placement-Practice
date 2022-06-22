package Array;
import java.util.Scanner;

public class main_A1 {
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        size=sc.nextInt();
        A1 obj = new A1(size);
        for(int index=0;index<size;index++)
        {
            System.out.println("Enter value to be inserted:");
            int value = sc.nextInt();
            obj.insert(index,value);
        }
        obj.display();
        obj.access(2);
        obj.reverse();
        obj.search(11);
        obj.delete(12);
        obj.display();
        //obj.update(3,54);
        obj.display();
        obj.left_rotate(3);
        obj.right_rotate(3);
        sc.close();
        
    }
    
}
