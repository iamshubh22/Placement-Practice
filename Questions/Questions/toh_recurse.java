package Questions;

public class toh_recurse {

    static void toh(int n,char A,char B ,char C)
    {
        if(n<=0)
        {
            System.out.println("No proper disk taken");
        }
        else if(n==1)
        {
            System.out.println("Disk moved  "+A+"  to  "+C);
        }
        else
        {
            toh(n-1,A,C,B);
            toh(1,A,B,C);
            toh(n-1,B,A,C);
        }
    }
    public static void main(String[] args)
    {
        int n=3;
        toh(n,'A','B','C');
    
    }
    
}
