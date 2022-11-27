package Lab4;
import java.util.*;

interface LabInCharge
{
	abstract void install(String LabName, int roomNo);
}

abstract class PHDscholar
{
	abstract void help(String ScholarName, int LabsConducted);
	
	void labsAssigned(String ScholarName, int LabsConducted)
	{
		System.out.println("Labs Conducted till now: "+LabsConducted);
	}
}

class Professor extends PHDscholar implements LabInCharge
{
	void help(String SchoolName, int LabsConducted) {	
	}
	void teaches(String subject, int emp_id)
	{
		System.out.println("Subject Name: "+subject);
		System.out.println("Employee ID: "+emp_id);
	}
	public void install(String LabName, int roomNo)
	{
		System.out.println("Name of the LAB: "+LabName);
		System.out.println("Room Number: "+roomNo);
	}
	public void help(String SchoolName, String LabsConducted)
	{
		System.out.println("Name of the School: "+SchoolName);
		System.out.println("Number of Labs Conducted: "+ LabsConducted);
	}
	
}

public class HOD{
	static String subject;
	static int emp_id;
	public static void main(String[] args)	{
		String LN, SN;
		int RN, LC;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Employee ID: ");
		emp_id = sc.nextInt();
		System.out.println("Subject name: ");
		subject = sc.next();
		System.out.println("Enter the Lab name: ");
		LN = sc.next();
		System.out.println("Enter the Room Number: ");
		RN = sc.nextInt();
		System.out.println("Enter the Scholar Name: ");
		SN = sc.next();
		System.out.println("Enter the number of Labs Conducted: ");
		LC = sc.nextInt();
		
		Professor pr=new Professor();
		
		pr.install(LN, RN);
		pr.help(SN, LC);
		pr.teaches(subject, emp_id);
		pr.labsAssigned(SN, LC);
		
		sc.close();
	}
}