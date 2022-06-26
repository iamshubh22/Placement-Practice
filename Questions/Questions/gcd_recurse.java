package Questions;

public class gcd_recurse {

    static int gcd(int n ,int e)
    {
        if(n<0||e<0)
        {
            return -1;
        }
        else if(e==0)
        {
            return n;
        }
        else
        {
            return gcd(n,n%e);
        }
    }

    public static void main(String [] args)
    {
        int n=4;
        int e=8;
        System.out.println(gcd(n,e));
    }
    
}
