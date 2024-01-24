import java.util.*;
public class BoxDemo
{
    public static void main(String[] args) 
    {
        Box b1 = new Box();
        Box b2 = new Box();
        System.out.println("\nEnter Box-1 dimensions: ");
        b1.accept();
        b1.display();
        System.out.println("\tVolume of box-1 : " + (b1.volume()));
        System.out.println("\nEnter Box-2 dimensions: ");
        b2.accept();
        b2.display();
        System.out.println("\tVolume of box-2 : " + (b2.volume()));
    }
}

class Box
{
    private int len, wid, height;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        wid = sc.nextInt();
        height = sc.nextInt();
    }
    public void display()
    {
        System.out.print("\tGiven parameters : ");
        System.out.println("Length - " + len + " , Width - " + wid + " , Height - " + height);
    }
    public int volume()
    {
        int v = len*wid*height;
        return v;
    }
}