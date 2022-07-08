public class counting {

    static void count(int arr[], int n , int k)
    {
        int b[]=new int[n];
        int count[] = new int [k+1]; 
        for(int i=0;i<n;i++)
        {
            ++count[arr[i]];
        }
        for(int i=1;i<=k;i++)
        {
            count [i]=count[i]+count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            b[--count[arr[i]]]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=b[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        int arr[]={1,0,2,1,0,1,1,5,6,7,5,4,2,2,0,0,1};
        int n=arr.length;
        int k=arr[0];
        for(int i=1;i<n;i++)
        {
            if (arr[i]>k)
            {
                k=arr[i];
            }
        }
        System.out.println(k);
        count(arr, n, k);
    }
    
}
