package Lab1;
import java.util.*;

class PlayerRecords{
    private String Name;
    private int Age;
    private float Salary;
     
    public String getName ()    {
        return Name;
    }
  
    public int getAge ()    {
        return Age;
    }
  
    public float getSalary ()    {
        return Salary;
    }
      
    public void setName (String newName)    {
        this.Name = newName;
    } 
    public void setAge (int newAge)    {
        this.Age = newAge;
    } 
    public void setSalary (float newSalary)    {
        this.Salary = newSalary;
    } 
} 

public class Records{
  public static void main (String[]args)  {
    PlayerRecords Obj[];
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the number of Players: ");
    int n = scan.nextInt ();
    Obj = new PlayerRecords[n];
    for (int i = 0; i < n; i++)    {
	    Obj[i] = new PlayerRecords ();
        System.out.println("Enter the name of Player "+(i+1));
	    Obj[i].setName(scan.next ());
        System.out.println("Enter the Age of Player "+(i+1));
        Obj[i].setAge(scan.nextInt ());
        System.out.println("Enter the Salary of Player "+(i+1));
	    Obj[i].setSalary(scan.nextFloat());
    } 
    
    for (int j = 0; j < 3; j++)    {
        System.out.println("Name of the player : " + Obj[j].getName());
        System.out.println("Age of " + Obj[j].getName() + ": "+ Obj[j].getAge ());
        System.out.println("Salary for "+ Obj[j].getName() + ": " + Obj[j].getSalary ());
    } 
    
    float highestSalary = Obj[0].getSalary ();
    String highName = "";
    for (int j = 0; j < 3; j++)    {
        if (Obj[j].getSalary () > highestSalary)    	{
    	    highestSalary = Obj[j].getSalary ();
    	    highName = Obj[j].getName ();
    	}
    	
    	else    	{
    	    highName = Obj[0].getName ();
    	}
    }
    System.out.println (highName + " " + "have the highest salary");
    }
}

