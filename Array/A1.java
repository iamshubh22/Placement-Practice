package Array;

import java.util.*;

public class A1 {
    int [] arr=null;
    int n;
    public A1(int n)
    {
        arr=new int[n];
        for(int index = 0; index < n; index++)
        {
            arr[index]=Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value)
    {
        if(arr[index]==Integer.MIN_VALUE)
        {
            arr[index]=value;
            System.out.println("Value inserted");
        }
        else
        {
            System.out.println("Value not inserted as size not left or cell occupied");
        }

    }
    public void display()
    {
        System.out.println(Arrays.toString(arr));
    }
    
    public void access(int index)
    {
        System.out.println(arr[index]);
    }

    public void reverse()
    {
        System.out.println("Reverse Traversal");
        for(int index=arr.length-1;index>=0;index--)
        {
            System.out.println(arr[index]);
        }
    }
    
    public void search(int value)
    {
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==value)
            {
                System.out.println("Value found at index at "+index);
            }
        }
    }
    public void delete(int value)
    {
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==value)
        {
        arr[i]=Integer.MIN_VALUE;
        System.out.println("Value Successfully deleted");
        return;
        }
    }   
    System.out.println("Value not deleted as not found in the array");
    return;
    }
    public void update(int index,int n_value)
    {
        arr[index] = n_value;
        System.out.println("Value successfully updated");
    }
    public void left_rotate(int value)
    {
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }        
        for(int i = 0; i < value; i++){    
            int j, first;     
            first = arr[0];     
            for(j = 0; j < arr.length-1; j++){        
                arr[j] = arr[j+1];    
            }       
            arr[j] = first;    
        }    
        
        System.out.println();    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }

    public void right_rotate(int value)
    {
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }        
        for(int i = 0; i < value; i++){    
            int j, last;     
            last = arr[arr.length-1];     
            for(j = arr.length-1; j > 0; j--){        
                arr[j] = arr[j-1];    
            }       
            arr[0] = last;    
        }    
        
        System.out.println();    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }

    
}
