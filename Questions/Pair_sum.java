// checking for pairs in the array that can achieve the target.

package Questions;
public class Pair_sum {
    public static void main(String args[])
    {
        int []arr={1,2,3,4,5,6};
        int target=5;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
