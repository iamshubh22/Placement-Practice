package Questions;

public class substring_string {

    static void sub(String ans,int i,int n,String s)
    {
        if(i==n)
        {
            System.out.println(ans);
        }
        else
        {
            sub(ans, i+1, n, s);
            ans =ans+s.charAt(i);
            sub(ans, i+1, n, s);
        }
    }
    public static void main(String [] args)
    {
        String s="abc";
        int n=s.length();
        sub(" ", 0, n, s);
    }
    
}
