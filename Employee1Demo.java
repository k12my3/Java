/*write a java program to define a class employee having 3 member variables: employee id, name, salary
3 methods : accept, display, calculate annual salary. create 2 objects & find employee who is drawing max salary*/

import java.util.*;

public class Employee1Demo 
{
    public static void main(String[] args) 
    {
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1();

        System.out.print("\n Enter Employee-1 ID, Salary, Name : ");
        e1.accept();
        e1.display();
        System.out.println("Employee-1 annual salary : " + e1.calAnnualSal());

        System.out.print("\n Enter Employee-2 ID, Salary, Name : ");
        e2.accept();
        e2.display();
        System.out.println("Employee-2 annual salary : " + e2.calAnnualSal());

        e1.maxSal(e2);
    }
}
class Employee1
{
    private int empid;
    private float empsal;
    private String empname;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        empid = sc.nextInt();
        empsal = sc.nextFloat();
        empname = sc.next();
    }
    public void display()
    {
        System.out.println("Entered Details : || EmpID : " + empid + " | EmpName : " + empname + " | EmpSalary : " + empsal);
    }
    public float calAnnualSal()
    {
        return (empsal*12);
    }
    public void maxSal(Employee1 b)
    {
        System.out.print("\nEmployee with max salary : " + ((empsal > b.empsal) ? empname : b.empname));
    }
}