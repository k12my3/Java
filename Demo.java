
import java.util.*;

class Demo
{
    public static void main(String[] args)
    
    {
        Scanner sc = new Scanner(System.in);
        int a,b,s;
        System.out.println("Enter no.1 : ");
        a = sc.nextInt();
        System.out.println("Enter no.2 : ");
        b = sc.nextInt();
        s = a+b;
        System.out.println("Sum = " + s);
        sc.close();
    }
}