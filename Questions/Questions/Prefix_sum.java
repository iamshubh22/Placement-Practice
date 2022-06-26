//Given an array arr[] of size n, its prefix sum array is another array prefixSum[] of the same size, such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] … arr[i].

package Questions;

public class Prefix_sum {

    static void prefix(int arr[],int n, int arr1[])
    {
        arr1[0] =arr[0];

        for(int i = 1; i < n; ++i)
        {
            arr1[i]=arr1[i-1]+arr[i];
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5,6};
        int n =arr.length;
        int [] arr1 = new int [n];

        prefix(arr, n, arr1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
