class fact_recurse
{
    static int recurse(int n)
    {
        if(n<0)
        {
            return -1;
        }
        else if(n==0)
        {
            return 1;
        }
        else
        {
            return n * recurse(n-1);
        }
    }
    public static void main (String [] args)
    {
        int n=5;
        System.out.println(recurse(n));
    }
}