package Questions;
public class sum_digit_recurse {
    static int add(int n)
    {
        if(n<0||n==0) 
        return 0;
        else
        return n%10 + add(n/10);
    }

    public static void main(String[] args)
    {
        int n=712;
        System.out.println(add(n));
    }
}
