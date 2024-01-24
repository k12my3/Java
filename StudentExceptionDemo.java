

/*Create a Student class with ID, name, gender and branch. use getters and setters. ID : 10-Digit, name - no special chars or 
digits, gender : M/F, branch :  ECE/CSE. use toString() to format details of student.
create user defined exceptions for invalid ID, name, gender or branch. 
Create objects of class Student and check whether user defined exceptions is throwb if invalid data is entered.

other methods : isDigit(), isLetter(), regex (?)

*/


import java.util.*;

import StudException.*;

class StudentExceptionDemo
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Info : ");
        s1.setID(sc.next());
        s1.setName(sc.next());
        s1.setGender(sc.next());
        s1.setBranch(sc.next());
        sc.close();
        try
        {
            s1.validateData();
            System.out.println("\nGiven data is valid: \n" + s1);
        }
        catch(InvalidDataException id)
        {
            System.out.print("\nException: " + id);
        }
    }
}