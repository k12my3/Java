import java.util.StringTokenizer;

public class StringTokenizerDemo
{
    public static void main(String[] args) 
    {
        String s1 = "one,two,three,four,five";
        StringTokenizer st1 = new StringTokenizer(s1, ",");
        while(st1.hasMoreTokens())
        {
            System.out.println("Token is : " + st1.nextToken());
        }
        System.out.println("\nFor 2 delimiters : ':' and ',' :");
        String s2 = "one:1,two:2,three:3,four:4,five:5";
        StringTokenizer st2 = new StringTokenizer(s2, ":,");
        while(st2.hasMoreTokens())
        {
            System.out.println("Token is : " + st2.nextToken(","));
        }
    }
}