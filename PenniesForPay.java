//4. Pennies for Pay
//Write a program that calculates the amount a person would earn over a period of time if 
//his or her salary is one penny the first day, two pennies the second day, and continues to 
//double each day. The program should display a table showing the salary for each day, and 
//then show the total pay at the end of the period. The output should be displayed in a dollar 
//amount, not the number of pennies.
//Input Validation: Do not accept a number less than 1 for the number of days worked.

import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

// This program demonstrates a solution to the Pennies for Pay programmin challenge.


public class PenniesForPay {
    public static void main(String[] args) {
    
        //Penny accumulator
        int pennies; 
        //Total pay accumulator
        int totalPay; 
        //Max Numer of days
        int maxDays; 
        //Day counter
        int dayCount; 

        //Creat a Scanner  object for keyboard input. 
        Scanner keyboard = new Scanner(System.in);

        //Get the maximum number of days. 
        System.out.print("For how many days will you work? "); 
        maxDays = keyboard.nextInt();

        //Validate the input
        while (maxDays < 1) {
            System.out.print("The numer of days " + "must be at least 1. \n" + "Enter the number of days: "); 
            maxDays = keyboard.nextInt(); 
        }

        //Initialize day counter to day 1
        dayCount = 1;
        
        //Initialize the penny accumulator for the first day at work
        pennies = 1;
        
        //Initialize the total pay accumulator
        totalPay = 0;

        //Display the report header
        System.out.println("Day\t\tPennies Earned"); 

        //Display the income report
        while (dayCount <= maxDays) {
            //Display the day number and pennies earned
            System.out.println(dayCount + "\t\t" + pennies);

            //Accumulate the total pay
            totalPay += pennies; 

            //Increment for the next day
            dayCount++;

            //Double the number of pennies
            pennies *= 2; 

            //Display the total pay 
            System.out.printf("Total pay: $%,.2f\n", (totalPay / 100.0));
        }

    }
    
}
