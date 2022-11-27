package Lab3;

import java.util.*;

class SmartShopping extends Shopping
{
	void BillGenerate()
	{	
		if(code==1)		
		{
			Price = 10000;
			System.out.println("MOBILE:     10000/-");
		}
		else if(code==2)		
		{
			Price = 60000;
			System.out.println("LAPTOP:     60000/-");
		}
		else if(code==3)		
		{
			Price = 80000;
			System.out.println("CAMERA:     80000/-");
		}
		else
		{
			System.out.println("Wrong input Enter again");
			return;
		}
		
		System.out.println("Your bill is: "+Price);
	}
}

class PremiumCustomer extends SmartShopping{
	PremiumCustomer(double Price) 
	{
		super();
	}
	
	void BillGenerate() 	
	{	
		double discount = 0.1*Price;
		Price = Price - discount;
		System.out.println("Bill after Discount: "+Price);
	}
}

public class Shopping
{
	static double Price;
	static int code;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int CType;
		int pieces;
		
		SmartShopping OR = new SmartShopping();
		SmartShopping OR1 = new PremiumCustomer(Price);
				
		int n=2;
		while(n>=1)
		{
			System.out.print("Customer Name: ");
			String name = scan.next();
			
			System.out.println("Customer Type: 1)PREMIUM 2)REGULAR 3)GENERAL");
			CType = scan.nextInt();
			
			System.out.println("Items bought: 1)Mobile 2)laptop 3)Camera");
			code = scan.nextInt();
			
			if(CType==1)			
			{
				System.out.println("ITEMS       PRICE");
				OR.BillGenerate();
				System.out.println("You are Our PREMIUM Costumer");
				OR1.BillGenerate();
			}
			
			else if(CType==2)			
			{
				System.out.println("ITEMS       PRICE");
				OR.BillGenerate();
				System.out.print("You are Our Regular Costumer");
				if(Price>=50000)				
				{
					System.out.println(", but your bill is above 50000/-");
					System.out.println("You get 10% discount !!");
					OR1.BillGenerate();
				}
				else
				{
					OR.BillGenerate();
				}
			}
			
			else
			{
				System.out.println("You are Our GENERAL Costumer");
				System.out.println("ITEMS       PRICE");
				OR.BillGenerate();
			}
			
			System.out.println();
			n++;
		}
		
		scan.close();
	}
}