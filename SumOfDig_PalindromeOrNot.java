package test_02_04_25;

import java.util.Scanner;

// WAPTC Sum of digits in given number is palindrome or not
public class SumOfDig_PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int temp = num;
		int sum = 0;
		while(temp>0)
		{
			int ld = temp%10;
			sum += ld;
			temp/=10;
		}
		System.out.println(sum);
		if(isPalindrome(sum))
			System.out.println("Sum Of Digits is Palindrome");
		else	
			System.out.println("Sum Of Digits is Not a Palindrome");
	}
	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		int temp = num;
		while(temp>0)
		{
			int ld = temp%10;
			rev = rev * 10 + ld;
			temp/=10;
		}
		if(num == rev)
			return true;
		else
			return false;
	}
}
