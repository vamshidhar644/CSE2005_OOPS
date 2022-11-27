package Lab8;
import java.util.*;

class Thread0 extends Thread {
	public void run()
	{
		int a[] = new int[100];
		System.out.println("Even numbers");
		for(int i=0;i<100;i++) {
			a[i]=i+1;
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}

class Thread1 extends Thread {
	public void run()	{
		int arr[] = new int[100];
		System.out.println("\nOdd numbers");
		for(int i=0;i<100;i++) {
			arr[i]=i+1;
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

class Thread2 extends Thread {
	public void run()
	{
		int ar[] = new int[100];
		System.out.println("\nNumbers divisible by 5");
		for(int i=0;i<100;i++) {
			ar[i]=i+1;
			if(ar[i]%5==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}
}

class Thread3 extends Thread 
{
	public void run()
	{
		int num, i, count=0;

		System.out.println("\nEnter a Number to check Prime: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}

		if(count==0)
			System.out.println("It is a Prime Number.");
		else
			System.out.println("It is not a Prime Number.");
	}
}
public class Test extends Thread 
{
	public void run()
	{
		System.out.println(" ");
	}
	
	public static void main(String[]args) 	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		
		System.out.println("Thread1 name is "+t1.getName());
		System.out.println("Thread2 name is "+t2.getName());
		System.out.println("Thread3 name is "+t3.getName());
		System.out.println("Thread4 name is "+t4.getName());
		
		t1.setName("Even");
		t2.setName("Odd");
		t3.setName("Divisibility");
		t4.setName("Prime");

		System.out.println("\nAFTER SETTING NAME: ");
		System.out.println("Thread1 name is "+t1.getName());
		System.out.println("Thread2 name is "+t2.getName());
		System.out.println("Thread3 name is "+t3.getName());
		System.out.println("Thread4 name is "+t4.getName());

		System.out.println();
		System.out.println("BEFORE SETTING PRIORITY: ");
		
		System.out.println("Priority of "+t1.getName()+" is "+t1.getPriority());
		System.out.println("Priority of "+t2.getName()+" is "+t2.getPriority());
		System.out.println("Priority of "+t3.getName()+" is "+t3.getPriority());
		System.out.println("Priority of "+t4.getName()+" is "+t4.getPriority());

		System.out.println("AFTER SETTING PRIORITY: ");
		System.out.println();
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		
		System.out.println("Priority of "+t1.getName()+" is "+t1.getPriority());
		System.out.println("Priority of "+t2.getName()+" is "+t2.getPriority());
		System.out.println("Priority of "+t3.getName()+" is "+t3.getPriority());
		System.out.println("Priority of "+t4.getName()+" is "+t4.getPriority());

		System.out.println();
		Thread0 T0 = new Thread0();
		Thread m1 = new Thread(T0);
		Thread1 T1 = new Thread1();
		Thread m2 = new Thread(T1);
		Thread2 T2 = new Thread2();
		Thread m3 = new Thread(T2);
		Thread3 T3 = new Thread3();
		Thread m4 = new Thread(T3);
		m1.start();
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException ex) 
		{
			System.out.println(ex);
		}
		
		m2.start();
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException ex) 
		{
			System.out.println(ex);
		}
		
		m3.start();
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
		m4.start();
		
		try 
		{
			m1.join();
			m2.join();
			m3.join();
			m4.join();
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}