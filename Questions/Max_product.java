// Check the pair of element that has the maximum product

package Questions;

public class Max_product {
    public static void main(String args[])
    {
        int []arr={1,2,3,4,5,6};
        int product=0;
        String pairs=" ";

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]*arr[j]>product)
                {
                    product=arr[i]*arr[j];
                    pairs=Integer.toString(arr[i])+","+Integer.toString(arr[j]);
                }
            }
        }
        System.out.println(pairs);   
    }
}
