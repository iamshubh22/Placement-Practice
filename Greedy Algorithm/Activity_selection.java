import java.util.Arrays;

public class Activity_selection 
{   
    static void Bubble(int [] arr,int n)
    {
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
        }
    }

    static public void max(int S[],int F[],int n)
    {
        System.out.println("Following Activity are selected : ");
       int i =0;
       System.out.println(i+" ");
       for(int j=1;j<n;j++)
       {
        if(S[j]>=F[i])
        {
            System.out.println(j+" ");
            i=j;
        }
       }  
    }

    public static void main(String [] args)
    {
        int s[]={1,3,0,5,8,5};
        int f[]={2,4,6,7,9,9};
        Bubble(f, f.length);
        Arrays.toString(f);
        max(s,f,s.length);
    }
}
