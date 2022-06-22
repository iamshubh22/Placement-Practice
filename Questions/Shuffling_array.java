package Questions;

//Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

import java.util.*;

class Shuffling_array{
    static Random r = new Random();
    
    static void randomize(int [] arr, int n)
    {
        for(int i = n-1; i >0; i--)
        {
            int j = r.nextInt(i+1);

            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp; 
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        randomize(arr, n);
    }
   }