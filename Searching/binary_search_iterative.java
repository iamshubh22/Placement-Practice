public class binary_search_iterative {

    static int binary(int arr[], int value)
    {
        int start=0;
        int end=arr.length-1;
        int middle=0;
        
        while(start<=end)
        {
            middle =(start +end)/2;
            if(arr[middle]==value)
            {
                System.out.println("value found at the index" + middle);
                return middle;
            }
            else if(arr[middle]<value)
            {
                 start=middle + 1;
            }
            else
            {
                end=middle - 1;
            }
        }
            System.out.println("Value not found in the array");
            return -1;
    }

    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int n = 8;
        binary(arr,n);
    }

    
    
}
