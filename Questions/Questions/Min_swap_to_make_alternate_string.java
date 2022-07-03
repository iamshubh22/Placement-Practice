package Questions;

public class Min_swap_to_make_alternate_string {

    public static void main(String[]args)
    {
        String s = "000111";
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++)
        {
            if((i==1 && (s.charAt(i)=='0')))
            {
                c1++;
            }
        } 
    }
    
}
