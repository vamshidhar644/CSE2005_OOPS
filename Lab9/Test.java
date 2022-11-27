package Lab9;

import java.util.Scanner;

class Test1 extends Test
{ 
	Test1(int sum)
	{  
		this.sum=sum;  
	}  
	public synchronized void run()	
	{
		System.out.println("Transation 1");
		Scanner scan = new Scanner(System.in);
		
		while(sum > 500)
		{
			System.out.println("Enter the task 1)DEPOSIT 2)WITHDRAW");
			int task = scan.nextInt();
			int D_or_W;
			if(task == 1)
			{
				System.out.println("Amount Deposited: ");
				D_or_W = scan.nextInt();
				sum = sum + D_or_W;
			}
			else if(task == 2)
			{
				System.out.println("Amount Withdrawn: ");
				D_or_W = scan.nextInt();
				sum = sum - D_or_W;
			}
			else
			{
				System.out.println("Wrong Input !! Enter again");
			}
			System.out.println("Balance Amount: "+sum);
		}
		System.out.println("minimum balance limit violation");	
	}
	
}

class Test2 extends Test 
{
	public Test2(int sum) {
		// TODO Auto-generated constructor stub
	}

	public synchronized void run()	
	{
		System.out.println("\nTransation 2");
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the task 1)DEPOSIT 2)WITHDRAW");
			int task = scan.nextInt();
			int D_or_W;
			if(task == 1)
			{
				System.out.println("Amount Deposited: ");
				D_or_W = scan.nextInt();
				sum = sum + D_or_W;
			}
			else if(task == 2)
			{
				System.out.println("Amount Withdrawn: ");
				D_or_W = scan.nextInt();
				sum = sum - D_or_W;
			}
			else
			{
				System.out.println("Wrong Input !! Enter again");
			}
			System.out.println("Balance Amount: "+sum);
		}
		while(sum > 500);
		System.out.println("minimum balance limit violation");
		
	}
}

public class Test extends Thread
{
	static int sum = 0;
	public static void main(String args[])	
	{

		int initialBalance = 1000;
		sum = initialBalance;
		
		Transaction1 t1 = new Transaction1(sum);
		Thread m1 = new Thread(t1);
		Transaction2 t2 = new Transaction2(sum);
		Thread m2 = new Thread(t2);
		
		System.out.println("Name of Thread 1: "+ t1.getName());
		System.out.println("Name of Thread 2: "+ t2.getName());
		
		t1.setName("Transaction 1");
		t2.setName("Transaction 2");
		
		System.out.println("Name of Thread 1: "+ t1.getName());
		System.out.println("Name of Thread 2: "+ t2.getName());

		System.out.println();
		
		m1.start();
		 try  		 
		 {
			Thread.sleep(50000);
		 } 
		 catch (InterruptedException ex) 		 
		 {
			System.out.println(ex);
		 }
		System.out.println();
		m2.start();

	}
}