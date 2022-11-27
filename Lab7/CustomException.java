package Lab7;

import java.util.*;
class OddSumException extends Exception
{
	public OddSumException(int sum)	{
		super();
	}
}
class EvenSumException extends Exception
{
	public EvenSumException(int sum) {
		super();
	}
}

//A Class that uses above MyException
public class CustomException{
	public static void main(String args[]) throws EvenSumException	{
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
				
		try		{
			int n = scan.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the Array elements: ");
			for(int i=0;i<n;i++)	{
				arr[i] = scan.nextInt();
				sum = sum + arr[i];
			}
			
			if(sum%2 != 0)	{
				throw new OddSumException(sum);
			}
			else	{
				throw new EvenSumException(sum);
			}
		}
		catch (OddSumException od)		{
			System.out.println("Sum = "+sum);
			System.out.println("Sum is ODD");
		}
		catch (EvenSumException ev)		{
			System.out.println("Sum = "+sum);
			System.out.println("sum is EVEN");
		}
	}
}
