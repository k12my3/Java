package AccException;
public class Account
{
    private int acno;
    private String acname;
    private double acbal;

    public Account(int no, String name, double bal)
    {
        this.acno = no;
        this.acname = name;
        this.acbal = bal;
    }

    //if 'throws' not mentioned : Uncaught Exception -> Object dev will not know withdraw might raise an exception
    // exception handler is not triggered or there is no exception handler -> program stops abruptly
    //Object dev should know withdraw() will raise an exception -> 'throws' keyword
    //throws informs javacompiler : method calling this function should have suitable catch block to handle the exception
    public double withdraw(double amt) throws InsufficientBalException, InvalidAmountException
    {
        if(amt%100 == 0)
        {
            if(amt <= this.acbal)
            {
                this.acbal -= amt;
                return this.acbal;
            }
            else
            {
                //or : throw new InsufficientBalException();
                //need to throw the withdraw exception to suitable exception handler
                InsufficientBalException ib = new InsufficientBalException(this.acbal);
                throw ib;
            }
        }
        else
        {
            InvalidAmountException ae = new InvalidAmountException();
            throw ae;
        }
    }
    public String toString()
    {
        return("\nAccount No: " + this.acno + "\nAccount Name: " + this.acname + "\nAccount Balance: " + this.acbal);
    }
}