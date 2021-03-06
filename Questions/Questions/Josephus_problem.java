//Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.
//The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.

package Questions;
class Josephus_problem {

    static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            /* The position returned by josephus(n - 1, k)
            is adjusted because the recursive call
            josephus(n - 1, k) considers the original
            position k%n + 1 as position 1 */
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    // Driver Program to test above function
    public static void main(String[] args)
    {
        int n = 14;
        int k = 2;
        System.out.println("The chosen place is "
                           + josephus(n, k));
    }
}