package Lab7;
import java.util.Scanner;

class Prime extends Thread
{
	public synchronized void run()	
	{
		int num, i, count=0;

		System.out.println("Enter a Number to check Prime : ");
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
      
      s.close();
	}
}

class Palindrome extends Thread 
{
	public synchronized void run()	{
		 int r,sum=0,temp;    
		 Scanner s = new Scanner(System.in);
		  System.out.println("\nEnter a Number to check Palindrome : ");
	      int n = s.nextInt(); 
		  
		  temp=n;    
		  while(n>0) {    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("It is a Palindrome number ");    
		  else    
		   System.out.println("It is not a Palindrome");    
	}
}

public class MultiThread 
{
	public static void main(String args[])	
	{
		Prime t1 = new Prime();
		Thread m1 = new Thread(t1);
		Palindrome t2 = new Palindrome();
		Thread m2 = new Thread(t2);
		

		m1.start();
		 try  		 {
			Thread.sleep(10000);
		 } 
		 catch (InterruptedException ex) 		 {
			System.out.println(ex);
		 }
		m2.start();

		try 		{
			m1.join();
			m2.join();
		}
		catch (InterruptedException e) 		
		{
			e.printStackTrace();
		}
	}
}