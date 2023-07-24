//4.1: Roman Numerals
//Write a program that asks the user to enter a number within the range of 1 through 10. Use a switch statement to display the Roman numeral version of that number.

//Input Validation: Do not accept a number less than 1 or greater than 10.

//Prompts And Output Labels. Use the following prompt for input: "Enter a number in the range of 1 - 10: ". The output of the program should be just a Roman numeral, such as VII.

//CLASS NAMES. Your program class should be called RomanNumerals

import java.util.Scanner; 

public class RomanNumerals
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in); 
		
		int number;
		System.out.println("Enter a number in the range of 1 - 10: ");
		number = keyboard.nextInt(); 
		
		if (number < 1|| number > 10) 
		{
			System.out.println("INVALID");
		}
		
		switch(number)
		{
			case 1:
			System.out.println("I");
			break;
			case 2: 
			System.out.println("II");
			break;
			case 3:
			System.out.println("III"); 
			break;
			case 4: 
			System.out.println("IV");
			break;
			case 5: 
			System.out.println("V");
			break; 
			case 6: 
			System.out.println("VI"); 
			break; 
			case 7: 
			System.out.println("VII"); 
			break; 
			case 8: 
			System.out.println("VIII"); 
			break; 
			case 9:
			System.out.println("IX"); 
			break;
			case 10: 
			System.out.println("X"); 
			break; 
		}
	}
}
