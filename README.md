
# Sum of Digits Palindrome Checker

This Java program checks whether the **sum of the digits** of a given number is a **palindrome** or not.

## 🧾 Problem Statement
Write a program to check whether the **sum of digits** in the given number is a **palindrome**.

## 📌 Description
This program performs the following steps:
1. Takes an integer input from the user.
2. Calculates the **sum of its digits**.
3. Checks if the resulting sum is a **palindrome**.
4. Prints the appropriate message.

## 🧠 Logic Used

### Step 1: Input Handling
The program uses a `Scanner` object to read an integer from the user.

### Step 2: Sum of Digits
Using a `while` loop, it extracts the last digit of the number using `temp % 10`, adds it to a sum variable, and removes the last digit using `temp /= 10`.

### Step 3: Palindrome Check
The `isPalindrome(int num)` method reverses the sum and compares it with the original sum. If both are equal, the number is a palindrome.

### Step 4: Output
Displays whether the sum is a palindrome or not.

## 📎 Example

**Input:** `12321`  
**Sum of digits:** `1+2+3+2+1 = 9`  
**Output:** `Sum Of Digits is Palindrome`

## 📄 Code

```
package test_02_04_25;

import java.util.Scanner;

public class SumOfDig_PalindromeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0)
        {
            int ld = temp % 10;
            sum += ld;
            temp /= 10;
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
        while(temp > 0)
        {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }
        return num == rev;
    }
}
```

## ✅ Output Example
```
Enter the Number
12321
9
Sum Of Digits is Palindrome
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Sum_Of_Digits_Palindrome_Or_Not.git
```
