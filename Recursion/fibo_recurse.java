public class fibo_recurse {

    static int fibo(int n)
    {
        if(n<0) 
        return -1;
        else if(n==0||n==1)
        return 1;
        else 
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args)
    {
        int n=5;
        System.out.println(fibo(n));
    }
    
}
