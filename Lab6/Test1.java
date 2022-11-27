package Lab6;
import java.util.Scanner;

interface College1
{
	abstract void knowCollege(String collegeName, String city, String state,int pinCode, String country);
}

class Department1
{
	public void knowCollege(String collegeName, String city, String state, int pinCode, String country) 
	{
		System.out.println("College Name: "+collegeName);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("PINCODE: "+pinCode);
		System.out.println("Country: "+country);
	}
	public void show(int NoD, int NoP, int NoS_CSE, int NoS_IT) 
	{
		int numberOfDepartments = NoD;
		int numberOfProfessors = NoP;
		
		class CSE
		{
			public void showCSE()
			{
				int numberOfStudents = NoS_CSE;
				System.out.println("Number of Students in CSE: "+numberOfStudents);
			}
		}
		
		class IT
		{
			public void showIT()
			{
				int numberOfStudents = NoS_IT;
				System.out.println("Number of Students in IT: "+numberOfStudents);				
			}
		}

		System.out.println("Number of Departments: " + numberOfDepartments);
		System.out.println("Number of Profesors: " + numberOfProfessors);
		
		CSE obj1 = new CSE();
		obj1.showCSE();
		IT obj2 = new IT();
		obj2.showIT();
		
		
	}	
}
public class Test1
{
	static int NoD;
	static int NoP;
	static int NoS_CSE;
	static int NoS_IT;
	public static void main(String[] args)
	{
		String CN, cty, st, cntry;
		int PC;
		Scanner sc = new Scanner(System.in);
		Department obj = new Department();
		System.out.println("Enter the College name: ");
		CN = sc.next();
		System.out.println("Enter the City name: ");
		cty = sc.next();
		System.out.println("Enter the State name: ");
		st = sc.next();
		System.out.println("Enter the PINCODE");
		PC = sc.nextInt();
		System.out.println("Enter the Country name");
		cntry = sc.next();
		
		System.out.println("Enter the Number of Departments: ");
		NoD = sc.nextInt();
		System.out.println("Enter the Nunmber of Professors: ");
		NoP = sc.nextInt();
		System.out.println("Enter the Number of Students in CSE: ");
		NoS_CSE = sc.nextInt();
		System.out.println("Enter the Number of Students in IT: ");
		NoS_IT = sc.nextInt();
		
		obj.knowCollege(CN, cty, st, PC, cntry);
		obj.show(NoD, NoP, NoS_CSE, NoS_IT);
	
	}
}

