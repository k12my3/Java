//Q. Find the sum of digits of a given number -> till the sum becomes a single digit (173 = 1+7+3 -> 1+1 -> 2)
import java.util.*;
public class SingleDigitSum 
{
    public static void main(String[] args) 
    {
        SDSum m = new SDSum();
        System.out.print("\nEnter the number : ");
        m.accept();
        System.out.println("\nThe sum is : " + m.sdsum());
    }
}
class SDSum
{
    private int n,s;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    public int sdsum()
    {
        for(s=0; (n>0 || s>9); n/=10) 
        {
            if(n==0) 
            {
                n = s;
                s = 0;
            }
            s+=n%10;
        }
        return s;
    }
}