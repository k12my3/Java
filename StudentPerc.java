
import java.util.Scanner;
/*write a java rpogram to define a class student having 3 member variables (stid, maxmarks, marksobtained)

use a static method to set max marks and write 2 methods to accept stid, marksobt and display stid and percentage*/
public class StudentPerc 
{
    public static void main(String[] args) 
    {
        System.out.print("\nEnter Student ID, Marks obtanied : ");
        student s = new student();
        s.accept();
        student.setMaxMarks(50);
        s.display();
    }
}

class student
{
    private int stid, stmarksobt;
    private static int maxmarks;

    public static void setMaxMarks(int m)
    {
        maxmarks = m;
    }
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        this.stid = sc.nextInt();
        this.stmarksobt = sc.nextInt();
    }
    public void display()
    {
        Double p = ((double)this.stmarksobt/maxmarks)*100;
        System.out.println("\nStudent ID : " + this.stid + ", Percentage : " + p + "%");
    }
}