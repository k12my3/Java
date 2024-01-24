
//Java : Polymorphism - Overloading (either no. of parameters or datatype of parameters should be different)

public class AddOverloadDemo
{
    public static void main(String[] args) 
    {
        AddOverload x = new AddOverload();
        int a = x.add(10,5);
        int b = x.add(10, 211, 32);
        double c = x.add(23.3, 23.2, 32.2);
        System.out.println("\nSum using Add-1 : " + a + " , Add-2 : " + b + " , Add-3 : " + c);
        //Overloading multiple main methods possible but only this main method is executed (main w/ String[] / string array parameter)
    }
    public static void main(String args) 
    {
        System.out.println("Testing overload main-2"); //This o/p is not shown / this main function isnt executed
    }
    public static void main(int[] args) 
    {
        System.out.println("Testing overload main-3"); //This o/p is not shown / this main function isnt executed
    }
}
class AddOverload
{
    public double add(double a, double  b, double c) //Add-1
    {
        return (a+b+c);
    }
    public int add(int a, int b, int c) //Add-2
    {
        return (a+b+c);
    }
    public int add(int a, int b) //Add-3
    {
        return (a+b);
    }
    /*public void add(int a, int b, int c) // Add-4 : this function is not executed / gives error : method is not overloaded based on return type  
    {
        System.out.println("Sum with Add-4 : " + (a+b+c));
    }*/
}