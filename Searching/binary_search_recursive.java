public class binary_search_recursive {
    
   static int binarySearch(int arr[], int l, int r, int x)
    {

        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int n = 6;
        int start=0;
        int end=arr.length-1;
        System.out.println(binarySearch(arr,start,end,n));
    }
 
}
