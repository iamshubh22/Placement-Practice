public class Selection_sort {

    static  void selection(int arr[] ,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min =i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    public static void main(String [] args)
    {
        int [] arr ={3,6,1,22,11,7};
        int n=arr.length;
        selection(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
