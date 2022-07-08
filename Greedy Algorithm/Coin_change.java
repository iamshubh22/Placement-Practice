public class Coin_change {

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
    }

    static int max(int arr[],int t)
    {
        int n=arr.length;
        int count=0;
        Bubble(arr,n);
        for(int i=n-1;i>=0;i--)
        {
            while(t>=arr[i])
            {
                t= t- arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,5,9,8};
        int total=7;
        System.out.println(max(arr,total));
    }
    
}
