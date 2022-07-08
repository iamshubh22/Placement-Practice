public class Insertion_Sort {
    static void insert(int arr[] ,int n)
    {
        int temp;
        for(int i=1;i<n;i++)
        {
            temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String [] args)
    {
        int arr[]={12,45,23,51,19,8};
        int n=arr.length;
        insert(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
