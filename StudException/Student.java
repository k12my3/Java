package StudException;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student
{
    private String id;
    private String name;
    private String gender;
    private String branch;

    public void setID(String id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public String getID()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getBranch()
    {
        return this.branch;
    }

    public String toString()
    {
        return("ID: " + this.id + "\nName: " + this.name + "\nGender: " + this.gender + "\nBranch: " + this.branch);   
    }

    public void validateData() throws InvalidDataException
    {
        String d = "[0-9]+";
        Pattern p = Pattern.compile(d);
        Matcher m = p.matcher(this.id);

        String n = "[A-Z][a-z]";
        Pattern p1 = Pattern.compile(n);
        Matcher m1 = p1.matcher(this.name);

        String g = "M | m | F | f";
        Pattern p2 = Pattern.compile(g);
        Matcher m2 = p2.matcher(this.gender);
        
        String b = "ECE | CSE";
        Pattern p3 = Pattern.compile(b);
        Matcher m3 = p3.matcher(this.branch);
        
        if(!(m.matches() || m1.matches() || m2.matches() || m3.matches()))
        {
            throw new InvalidDataException();
        }

        /*or : !((this.branch.equals("CSE") || this.branch.equals("ECE"))|| (this.gender.equals("F") || this.gender.equals("M")) etc*/
    }
}