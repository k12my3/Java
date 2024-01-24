//Q> Swamp 2 numbers

import java.util.*;
public class SwapVal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Given numbers: a = " + a + ", b = " + b);
        
        /*//a> using 3rd variable
        int temp = a;
        a = b;
        b = temp;

        //b> w/o using 3rd variable
        a = a+b;
        b = a-b;
        a = a-b;

        //c> using bitwise operators
        a = a^b;
        b = a^b;
        a = a^b;*/

        //d> using single instruction
        a = a+b-(b=a); //or : a = a ^ b ^ (b = a); 

        System.out.println("Swapped numbers: a = " + a + ", b = " + b);
    }    
}