package AccException;


public class InsufficientBalException extends Exception
{
    public double bal;
    public InsufficientBalException(double bal)
    {
        this.bal = bal;
    }
    public String toString()
    {
        return("\nAvailable Balance : " + bal);
    }
}