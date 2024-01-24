//Q. Display all the 3 digit armstrong numbers

public class ThreeDigitArmstrong 
{
    public static void main(String[] args) 
    {
        Armstrong a1 = new Armstrong();
        System.out.print("\n\tThe 3-digit Armstrong numbers include:");
        a1.display();
    }    
}
class Armstrong
{
    public void display()
    {
        for(int i=100; i<1000; i++)
        {
            int s=0;
            for(int j=i; j>0; j/=10)
                s = s + ((j%10)*(j%10)*(j%10));
            if(s==i)
                System.out.print(" " + i);
        }
    }
}