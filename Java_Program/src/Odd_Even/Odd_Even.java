package Odd_Even;
import java.util.*;
/*
 In Java, the modulus (%) operator returns the remainder when one number is divided by another. We use it to check if a number is odd or even.

Code Using %:
 */

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println(number + "is even.");
		}else {
			System.out.println(number + "is odd.");
		}
	}
}

/*
 The program calculates number % 2:
	If number % 2 == 0: The number is even (because it is perfectly divisible by 2).
	If number % 2 == 1: The number is odd (because it leaves a remainder of 1 when divided by 2).
	It prints whether the number is even or odd.
Example Cases:
	Input	Calculation (number % 2)			Output
	8			8 % 2 = 0						8 is even
	
	15			15 % 2 = 1						15 is odd
	
	0			0 % 2 = 0						0 is even
	
	Why % 2 Works?
	Even numbers: Always divisible by 2 without a remainder (0, 2, 4, 6, ...)
	Odd numbers: Always leave a remainder of 1 when divided by 2 (1, 3, 5, 7, ...).
 */

/*---------------------------------------------------------------------------------------------------------------------------------------------------
 Here's a Java program to check whether a number is odd or even without using the modulus (%) operator. 
Instead, we use bitwise AND (&) operator to determine if the least significant bit (LSB) is 0 (even) or 1 (odd).*/

class odd_Even1 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter any number: ");
	        int number = sc.nextInt();
	        
	        // Check if the last bit is 0 (even) or 1 (odd)
	        if ((number & 1) == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }
	}
}

/*
Explanation:
	Instead of %, we use bitwise AND (&) with 1.
	Any even number in binary ends with 0 (e.g., 10 → 1010).
	Any odd number in binary ends with 1 (e.g., 11 → 1011).
	number & 1 results in:
	0 for even numbers.
	1 for odd numbers.
  -------------------------------------------------------------------------------------------------------------------------------------
  */

/*
Using Division (/) and Multiplication (*)
	Logic:
		If a number is even, dividing it by 2 and then multiplying back by 2 will give the same number.
		If a number is odd, this operation will not give back the original number.
Code:
 */

	class Odd_Even2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        
        // Check by dividing and multiplying back
        if ((number / 2) * 2 == number) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }
}
/*
 -----------------------------------------------------------------------------------------------------------------------------------------------------	
 */
	
/*
Using Bitwise OR (|)
	Logic:
		Even numbers remain the same when OR-ed with 1 because their last bit is 0.
		Odd numbers increase by 1 when OR-ed with 1 because their last bit is 1.
		If number | 1 is the same as number, it means it's already odd.
Code:
 */
	
		class Odd_Even3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter any number: ");
	        int number = sc.nextInt();
	        
	        // Check using bitwise OR
	        if ((number | 1) > number) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	        sc.close();
	    }
	}
		
/*
 ---------------------------------------------------------------------------------------------------------------------------------------------------
 */
		
		
/*
Using Floor Division (//)
	Logic:
	If we divide an even number by 2 and multiply by 2, it remains unchanged.
	If we divide an odd number by 2, multiply by 2, and add 1, it remains unchanged.
Code:
 */
		
		

			class OddEven4 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter any number: ");
		        int number = sc.nextInt();
		        
		        // Check using floor division
		        if (number - (number / 2) * 2 == 0) {
		            System.out.println(number + " is even.");
		        } else {
		            System.out.println(number + " is odd.");
		        }

		        sc.close();
		    }
		}

/*
 -------------------------------------------------------------------------------------------------------------------------------------
 */
			
			
/*
Using Subtraction
	Logic:
		Start from the given number and keep subtracting 2.
		If we reach 0, it’s even.
		If we reach 1, it’s odd.
Code:

 */
			
			

				class OddEven {
			    public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        
			        System.out.print("Enter any number: ");
			        int number = sc.nextInt();
			        
			        // Keep subtracting 2
			        while (number > 1) {
			            number -= 2;
			        }

			        // Check final value
			        if (number == 0) {
			            System.out.println("Even");
			        } else {
			            System.out.println("Odd");
			        }

			        sc.close();
			    }
			}

/*
Conclusion

	Method								Operator Used
	Bitwise AND (&)						number & 1
	
	Division & Multiplication			(number / 2) * 2
	
 	**Bitwise OR (`						`)**
 	*
	Floor Division & Multiplication		number - (number / 2) * 2
	
	Repeated Subtraction				number -= 2
These methods prove that you don’t always need % to check if a number is even or odd!
 */


 