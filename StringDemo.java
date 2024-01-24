
import java.util.Scanner;

public class StringDemo 
{
    public static void main(String[] args) 
    {
        StringMenu s1 = new StringMenu();
        System.out.print("\nEnter the string to perform operations: ");
        s1.accept();
        
        while(true)
        {
            System.out.println("\nEnter your option:\n" + 
            "\n 1. CharAt \n 2. length \n 3. indexOf \n 4. substring \n 5. replace \n 6. exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    s1.charAtFunc();
                    break;
                
                case 2:
                    s1.lengthFunc();
                    break;
                
                case 3:
                    s1.indexOfFunc();
                    break;
                
                case 4:
                    s1.substringFunc();
                    break;
                
                case 5:
                    s1.replaceFunc();
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Option");
            }
        }
    }    
}
