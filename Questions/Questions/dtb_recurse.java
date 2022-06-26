package Questions;

public class dtb_recurse {

    static int dtb(int n)
    {
        if(n==0) 
        return 0;
        else
        return n%2+(10*dtb(n/2));
    }

    public static void main(String[] args)
    {
        int n=2;
        System.out.println(dtb(n));
    }

    
}
