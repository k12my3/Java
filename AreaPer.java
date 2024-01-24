//Q1: Write a Java program to find the area and perimeter of circle for given radius

import java.util.*;
class AreaPer
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double r, a, c;
        System.out.println("Enter radius of circle: ");
        r = sc.nextDouble();
        a = r*r*22/7;
        c = r*44/7;
        System.out.println("Given radius :" + r + "\nArea of circle: " + a + "\nCircumference of circle: " + c);
        sc.close();
    }
}