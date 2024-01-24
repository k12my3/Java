package AccException;


public class InvalidAmountException extends Exception
{
    public String toString()
    {
        return("Enter Amount in multiples of 100.");
    }
}