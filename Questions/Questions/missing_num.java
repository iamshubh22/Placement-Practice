// Missing number find between 1 to 10.

package Questions;
public class missing_num {
    public static void main(String args[])
    {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int [] arr1={1,2,3,4,6,7,8,9,10};
        int sum1=0;
        int sum2=0;
        int num;

        for(int i=0;i<arr.length;i++)
        {
            sum1 =sum1+arr[i];
        }

        for(int i=0;i<arr1.length;i++)
        {
            sum2 =sum2+arr1[i];
        }

        num=sum1-sum2;
        System.out.println(num);
    }
}
