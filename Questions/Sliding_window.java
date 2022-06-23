package Questions;

public class Sliding_window {
    static int maximize(int [] arr , int n , int k)
    {
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<n-k+1;i++) 
        {
            int current_sum=0;
            for(int j=0;j<k;j++)
            {
                current_sum+=arr[i+j];
                max_sum=Math.max(max_sum,current_sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args)
    {
        int[] arr={1,4,2,10,23,3,1,0,20};
        int  k=4;
        int n=arr.length;
        System.out.println(maximize(arr, n, k));
    }
    }
