public class Bubble_sort {

    static void Bubble(int [] arr,int n)
    {
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            } 
            if(flag==0)
            break;
            swap++;
        }
        System.out.println(swap);
    }

    public static void main(String [] args)
    {
        int [] arr={10,2,1,22,11};
        int n=arr.length;
        Bubble(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
