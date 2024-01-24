/*Q.write a java program to dfine a class Rational having 2 member variables only (numerator and denominator)
 include 3 methods : accpept, display and addRational(r1, r2). create 3 objects to perform above operation*/

import java.util.*;

public class RationalSum 
{
    public static void main(String[] args) 
    {
        Rational r1 = new Rational();
        Rational r2 = new Rational();
        Rational r3 = new Rational();

        System.out.println("\nEnter R1 : ");
        r1.accept();
        r1.display();
        System.out.println("\nEnter R2 : ");
        r2.accept();
        r2.display();
        r3.addRational(r1, r2);
    }
}

class Rational
{
    private int num, den;
    public void accept()
    {
        System.out.print("\nEnter the numerator and denominator : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        den = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Entered value : " + num + "/" + den);
    }
    public void addRational(Rational r1, Rational r2)
    {
        num = r1.num*r2.den + r1.den*r2.num;
        den = r1.den*r2.den;
        System.out.print("\nSum of given rational numbers = " + num + "/" + den);
    }
}
