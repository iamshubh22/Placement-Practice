package Questions;
public class palindrome_recurse 
{

    static int pali(int n,int temp)
    {
        if(n==0) 
        return temp;
            
        int r=(n%10);
        temp=(temp*10)+r;
        return pali(n/10,temp);

    }

    public static void main(String[] args)
    {
        int n=121;
        int temp=pali(n,0);

        if(temp==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome ");
        }
    }
    
}
