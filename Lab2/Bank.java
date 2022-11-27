package Lab2;
import java.util.*;


class SavingsAccount extends Bank
{
	SavingsAccount(String[] HolderName, String[] AccNum, int[] account_type, int amount[]) 	
	{
		super();
	}
	public void depositSB()		
	{
		for(int k = 0;k<4;k++)		
		{
			amount[k] = amount[k] + DrawWithdraw;
		}
	}
	public void withdrawSB()		
	{
		for(int k = 0;k<4;k++)		
		{
			amount[k] = amount[k] - DrawWithdraw;
		}
	}
}

class CurrentAccount extends Bank
{
	CurrentAccount(String[] HolderName, String[] AccNum, int[] account_type, int amount[]) 	{
		super();
	}
	public void depositCB()		
	{
		for(int k = 0;k<4;k++)		
		{
			amount[k] = amount[k] + DrawWithdraw;
		}
	}
	
	public void withdrawCB()	
	{
		for(int k = 0;k<4;k++)			{
			amount[k] = amount[k] - DrawWithdraw;
		}	
	}
}

public class Bank{
	static String[] HolderName = new String[4];
	static String[] AccNum = new String[4];
	static int[] Account_type = new int[4];
	static int[] amount = new int[4];
	static int DrawWithdraw;
	static int BankBalance=0;
	
	public static void main(String[] args)		{
		Scanner scan = new Scanner(System.in);

		CurrentAccount CB = new CurrentAccount(HolderName, AccNum, Account_type, amount);
		SavingsAccount SB = new SavingsAccount(HolderName, AccNum, Account_type, amount);
		int i;
		
		for(i=0;i<4;i++)			{
			System.out.println("Bank Holder name: ");
			HolderName[i] = scan.next();
			System.out.println("Accout number of "+HolderName[i]+": ");
			AccNum[i] = scan.next();		
			System.out.println("Account Type:\n 1)SAVINGS \n 2)CURRENT");
			Account_type[i] = scan.nextInt();
			if(Account_type[i] == 1)			
			{
				System.out.println("Enter the initial Amount in "+HolderName[i]+"'s Savings Account");
				amount[i] = scan.nextInt();
				BankBalance = BankBalance + amount[i];
				System.out.println("TASK: \n 1)DEPOSIT \n 2)WITHDRAW");
				int task = scan.nextInt();
				
				if(task == 1)						
				{
					System.out.println("Amount Deposited in Savings: ");
					DrawWithdraw = scan.nextInt();
					BankBalance = BankBalance + DrawWithdraw;
					SB.depositSB();
				}
				
				else
				{
					System.out.println("Amount Withdrawn in Savings: ");
					DrawWithdraw = scan.nextInt();
					BankBalance = BankBalance - DrawWithdraw;
					SB.withdrawSB();
				}
				
				System.out.println("Name the of the Bank Holder: " + HolderName[i]);
				System.out.println("Account Number : "+ AccNum[i]);
				System.out.println("Account Type: Savings Account");
				System.out.println("Balance Amount in "+HolderName[i] + "'s account: " + amount[i]);
				System.out.println("");
			}
			
			else			
			{
				System.out.println("Enter the initial Amount in "+HolderName[i]+"'s Current Account");
				amount[i] = scan.nextInt();
				BankBalance = BankBalance + amount[i];				
				System.out.println("What do u want to do: \n 1)DEPOSIT \n 2) WITHDRAW");
				int task = scan.nextInt();
				if(task == 1)	
				{
					System.out.println("Amount Deposited in Current: ");
					DrawWithdraw = scan.nextInt();
					BankBalance = BankBalance + DrawWithdraw;
					CB.depositCB();
				}
				
				else		
				{
					System.out.println("Amount Withdrawn in Current: ");
					DrawWithdraw = scan.nextInt();
					BankBalance = BankBalance - DrawWithdraw;
					CB.withdrawCB();
				}
					System.out.println("Name the of the Bank Holder: "+HolderName[i]);
					System.out.println("Account Number : "+ AccNum[i]);
					if(Account_type[i]==1)			
					{
						System.out.println("Account Type: Savings Account");
					}
					else			
					{
						System.out.println("Account Type: Current Account");
					}
					System.out.println("Balance Amount in "+HolderName[i] + "'s account: " + amount[i]);
					System.out.println("");
			}
		}
		System.out.println("Total Balance in the Bank: "+ BankBalance);
		scan.close();
	}
}
