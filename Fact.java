
import java.util.Scanner;
public class Fact 
{
    private int n;
    public void accept(int n)
    {
        this.n = n;
    }

    public int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return (n*factorial(n-1));
        }
    }
}