/*write a java program to define a class TimeConstructor having 3 member variables - hours, mins, secs
Write 3 constructors -> Time(h,m,s), Time() (h=m=s=0), Time(int secs ->(convert  to h & m))
Write toString method to display all time objects -> create 3 objects t1, t2, t3 and all operations
+ t4 : t1 + t3
+ t5 : i/p from user*/

import java.util.Scanner;
public class TimeConstructorDemo 
{
    public static void main(String[] args) 
    {
        /*int h,m,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter T1 h:m:s : ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        TimeConstructor t1 = new TimeConstructor(h, m, s);*/
        TimeConstructor t1 = new TimeConstructor(4, 18, 23);
        TimeConstructor t2 = new TimeConstructor();
        /*System.out.print("\nEnter Seconds for t3 : ");
        s = sc.nextInt();
        TimeConstructor t3 = new TimeConstructor(s);*/
        TimeConstructor t3 = new TimeConstructor(3661);
        TimeConstructor t4 = new TimeConstructor(t1, t3);
        TimeConstructor t5 = new TimeConstructor();
        System.out.print("\nEnter T5 H:M:S : ");
        t5.accept();
        System.out.println("\nT1 : " + t1 + "\nT2 : " + t2 + "\nT3 : " + t3 + "\nT4 : " + t4 + " (T1 + T3)" + "\nT5 : " +t5);
    }
}

class TimeConstructor
{
    private int hrs, mins, secs;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        this.hrs = sc.nextInt();
        this.mins = sc.nextInt();
        this.secs = sc.nextInt();
        sc.close();
    }
    public String toString()
    {
        return (this.hrs + ":" + this.mins + ":" + this.secs);
    }

    public TimeConstructor(int hrs, int mins, int secs) //t1
    {
        this.hrs = hrs;
        this.mins = mins;
        this.secs = secs;
    }
    public TimeConstructor() //t2
    {
        this.hrs = this.mins = this.secs = 0;
    }
    public TimeConstructor(int secs) //t3
    {
        this.hrs = secs /3600;
        this.mins = (secs % 3600) / 60;
        this.secs = (secs % 3600) % 60;
        /*or :
        this.sec = s%60;
        this.mins = s/60;
        this.hour = this.mins/60;
        this.mins = this.mins%60*/
    }
    
    public TimeConstructor(TimeConstructor t1, TimeConstructor t2) //t4
    {
        this.secs = t1.secs + t2.secs;

        if(this.secs >= 60)
        {
            this.secs-=60;
            this.mins += t2.mins+1;
        }
        else
        {
            this.mins=t1.mins + t2.mins;
        }

        if(this.mins >=60)
        {
            this.mins -= 60;
            this.hrs += t2.hrs+1;
        }
        else
        {
            this.hrs = t1.hrs + t2.hrs;
        }
    }
}