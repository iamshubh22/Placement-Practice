package Questions;

public class power_recurse {

    static int power(int n,int e)
    {
        if(e<0)
        return -1;
        else if(e==0)
        return 1;
        else
        return n * power(n,e-1);
    }

    public static void main(String [] args)
    {
        int n=2;
        int e=3;

        System.out.println(power(n,e));
    }    
}
