
import java.util.Scanner;
public class State 
{
    private String name;
    private String capital;
    private int population;
    private double literacy;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
        this.capital = sc.next();
        this.population = sc.nextInt();
        this.literacy = sc.nextDouble();
        sc.close();
    }

    public String toString()
    {
        return ("\n\nName: " + this.name + "\nCapital: " + this.capital + "\nPopulation: " + this.population + "\nLiteracy: " + this.literacy);
    }
}