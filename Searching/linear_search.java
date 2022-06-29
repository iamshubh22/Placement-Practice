public class linear_search {

    static int linear(int arr[],int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                System.out.println("Found at the index " + i );
                return i;
            }
        }
        System.out.println("not found in the array");
        return -1;
    }

    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int n = 6;
        linear(arr,n);
    }
    
}
