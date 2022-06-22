package Questions;
public class Array_permutation {
    public static void main(String args[])
    {
        int [] arr={1,4,2,5,3};
        int [] arr1={1,2,3,4,5};
        int sum1 =0 ,sum2 =0 ,mul1 =0 ,mul2 =0;
        for(int i=0;i<arr.length;i++)
        {
            sum1=sum1+arr[i];
            mul1=mul1*arr[i];
        }

        for(int i=0;i<arr1.length;i++)
        {
            sum2=sum2+arr1[i];
            mul2=mul2*arr1[i];
        }

        if(arr.length!=arr1.length)
        {
            System.out.println("No furthur operation can be performed");
        }
        else if (sum1==sum2&&mul1==mul2)
        {
            System.out.println("Permutation is present in arrays");
        }
        else
        {
            System.out.println("Permutation not present in arrays");
        }
    }
}
