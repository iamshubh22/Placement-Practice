package Array_linked_list;

import java.util.*;
public class arraylist {
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(100);
        list.add(5);
        list.add(15);
        
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        int max=list.get(0);
        int min=list.get(0);

        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
            }
        }
        
        for(int i=0;i<list.size();i++)
        {
            if(min>list.get(i))
            {
                min=list.get(i);
            }
        }
        System.out.println("\n"+max);
        System.out.println(min);

    }
    
}
