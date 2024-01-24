
public class StateDemo 
{
    public static void main(String[] args) 
    {
        State s1[] = new State[5];
        System.out.println("Enter the 5 states' records: ");
        for(int i=0; i<5; i++)
        {
            s1[i].accept();
        }
        System.out.print("\nThe 5 states' records are: ");
        for(int i=0; i<5; i++)
        {
            System.out.println("State - " + i+1 + s1[i]);
        }
    }    
}