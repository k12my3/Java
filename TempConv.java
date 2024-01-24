//Q : Write a Java program to convert temperature from Centigrade to Fahrenheit

import java.util.*;
public class TempConv 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.println("Enter the temperature in Celsius :");
        c = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit : " + ((c*9/5) + 32));
    }
}
