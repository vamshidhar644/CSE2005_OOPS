package Lab8;
import java.util.Scanner;

class Thread_0 extends Thread{
	public synchronized void run()	{
		System.out.println("\nEven numbers between 1 and 100: ");
		for(int a = 1; a <= 100; a++)	{
			if(a % 2 == 0)	{
				System.out.print(a + " ");
			}
		}
	}
}
class Thread_1 extends Thread 
{
	public synchronized void run()	
	{
		System.out.println("\nOdd numbers between 1 and 100: ");
	      for(int a = 1; a <= 100; a++)	      
	      {
	         if(a % 2 != 0)	         
	         {
	            System.out.print(a + " ");
	         }
	      }
	}
}

class Thread_2 extends Thread 
{
	public synchronized void run()	
	{
		System.out.println("\nNumbers divisible by 5 between 1 and 100: ");
		for(int a = 1; a <= 100; a++) 
		{
			if(a % 5 == 0)		
			{
				System.out.print(a + " ");
			}
		}
	}
}

class Thread_3 extends Thread{
	public synchronized void run()	{
		int num, i, count=0;
		System.out.println("\nEnter a Number to check Prime : ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();

		for(i=2; i<num; i++)  {
			if(num%i == 0) {
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

public class Threading {
	public static void main(String[] args)	{
		Thread_0 t1 = new Thread_0();
		Thread m1 = new Thread(t1);
		Thread_1 t2 = new Thread_1();
		Thread m2 = new Thread(t2);
		Thread_2 t3 = new Thread_2();
		Thread m3 = new Thread(t3);
		Thread_3 t4 = new Thread_3();
		Thread m4 = new Thread(t4);
		
		m1.start();
		try  {
			Thread.sleep(5000);
		} 
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
		
		m2.start();
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
		
		m3.start();
		try  {
			Thread.sleep(5000);
		} 
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
		
		m4.start();
	}
}
