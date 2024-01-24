//Q. Find the sum of the first and last digits of a given number

import java.util.*;

public class FirstLastSum 
{
    public static void main(String[] args) 
    {
        Num n1 = new Num();
        System.out.print("\n Enter the number: ");
        n1.accept();
        System.out.print("The sum of the first and last digits is : " + n1.flsum());
    } 
}
class Num
{
    private int n;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
    }
    public int flsum()
    {
        int s = n%10;
        for(int i=n; i>0; i/=10)
            n=i;
        return (s+n);
    }
}