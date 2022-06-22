package Array_linked_list;

import java.util.*;  
public class linkedlist{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  Iterator<String> it1=al.iterator();  
  while(it1.hasNext()){  
   System.out.println(it1.next());  
  }  
  al.remove("Ravi");
  al.remove(2);
  System.out.println();
  System.out.println();
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  