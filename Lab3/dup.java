/*
package Lab3;

import java.util.*;

class billGenerat extends dup
{
	void calculate() 	
	{	
		if(code==1)		{
			Price = 10000;
			System.out.println("MOBILE:     10000/-");
		}
		else if(code==2)		{
			Price = 60000;
			System.out.println("LAPTOP:     60000/-");
		}
		else if(code==3)		{
			Price = 80000;
			System.out.println("CAMERA:     80000/-");
		}
		else
		{
			System.out.println("Wrong input Enter again");
			return;
		}
	}
}

class PremiumCustomer1 extends billGenerat
{
	PremiumCustomer1(double Price) {
		super();
	}
	void calculate()
	{	
		double discount = 0.1*Price;
		Price = Price - discount;
		System.out.println("Your bill is: "+Price);
	}
}

class RegularCustomer1 extends billGenerat
{
	RegularCustomer1(double Price) {
		super();
	}

	void calculate()
	{	
		System.out.println("Your bill is: "+Price);
	}
}

class GeneralCustomer1 extends billGenerat
{
	GeneralCustomer1(double price) {
	}
	void calculate()
	{
		System.out.println("Your bill is: "+Price);
	}
}

public class dup
{
	static double Price;
	static int code;
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int CType;
		int pieces;
		billGenerat OR = new billGenerat();
		billGenerat OR1 = new PremiumCustomer1(Price);
		billGenerat OR2 = new RegularCustomer1(Price);
		billGenerat OR3 = new GeneralCustomer1(Price);
				
		int n=2;
		while(n>=1)
		{
			System.out.print("Customer Name: ");
			String name = scan.next();
			System.out.println("Customer Type: 1)PREMIUM 2)REGULAR 3)GENERAL");
			CType = scan.nextInt();
			System.out.println("Items bought: 1)Mobile 2)laptop 3)Camera");
			code = scan.nextInt();
			System.out.println("ITEMS       PRICE");
			OR.calculate();
			if(CType==1)			{
				System.out.println("You are Our PREMIUM Costumer");
				OR1.calculate();
			}
			else if(CType==2)			{
				System.out.print("You are Our Regular Costumer");
				if(Price>=50000)				{
					System.out.println(", but your bill is above 50000/-");
					System.out.println("You get 10% discount !!");
					OR1.calculate();
				}
				else
				{
					OR2.calculate();
				}
			}
			else
			{
				System.out.println("You are Our GENERAL Costumer");
				OR3.calculate();
			}
			System.out.println();
			n++;
		}
		scan.close();
	}
}
*/