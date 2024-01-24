
import java.util.Scanner;

public class ExceptionHandlingDemo 
{
    public static void main(String args[])
    {
        int a[] = {10,20,15,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index number");
        int i = sc.nextInt();
        try
        {
            int res = a[i]/i;
            System.out.println("Result is  "+res);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero is not possible");
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println("Index should be less than array size");
        }
        catch(Exception e) // it should be kept as last catch block
        {
            System.out.println("exception is "+e);
        }
        sc.close();
    }
}