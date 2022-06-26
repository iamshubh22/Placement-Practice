package Questions;

public class subset_sum_recurse {

    static boolean subset(int arr[],int n,int sum)
    {
        if(sum==0) 
        return true;
        if(n==0)
        return false;
        


        return subset(arr,n-1,sum)|| subset(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6};
        int sum = 9;
        int n =arr.length;

        if(subset(arr,n,sum)==true)
        {
            System.out.println("Subset is found");
        }
        else
        {
            System.out.println("Subset not found");
        }
    }
    
}
