//Q. Write a Java program to tell whether a given number is perfect or not
import java.util.*;

public class PerfectNum 
{
    public static void main(String[] args) 
    {
        System.out.print("\nEnter the number : ");
        PNum p1 = new PNum();
        p1.accept();
        System.out.println("The given number is " + (p1.perfect() ? "perfect" : "not perfect"));
    }
}

class PNum
{
    private int n, s=0;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
    }
    public boolean perfect()
    {
        for(int i=1; i<=(n/2); i++)
        {
            if((n%i) == 0)
                s=s+i;
        }
        return(n==s);
    }
}