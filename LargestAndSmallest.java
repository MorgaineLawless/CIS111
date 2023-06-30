//10. Largest and Smallest
//Write a program with a loop that lets the user enter a series of integers. The user should
//enter -99 to signal the end of the series. After all the numbers have been entered, the
//program should display the largest and smallest numbers entered. The value -99 is not to
//be counted as part of the series.

import java.util.Scanner;

public class LargestAndSmallest {
    
    public static void main(String[] args) {
        
        //Initialize var largest
        int Largest; 
        //Initialize var smallest
        int Smallest; 
        //Initialize var num
        int num;

        //Create Snanner object for input
        Scanner scan = new Scanner(System.in); 

        //Display Interger entry 
        System.out.print(" Enter an integer (-99 to stop):"); 
        num = scan.nextInt(); 
        Largest = Smallest = num; 
        
        //Algorithm for identifying smallest and largest number
        if(num!=-99){
            while(num!=-99) {
                if(num>Largest)
                Largest = num; 
                if(num<Smallest)
                Smallest = num; 
                System.out.print(" Enter an integer (-99 to stop):"); 
                num = scan.nextInt(); 
            }
        
        //Display the smallest and largest number
        System.out.println(" The smallest number was:" + Smallest); 
        System.out.println("The largest number was: " + Largest);   
        }
    }
}
