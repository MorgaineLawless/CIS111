//3.8: Software Sales
//A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
//Quantity Discount
//10-19 20%
//20-49 30%
//50-99 40%
//100 or more 50%
//Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount. For instance, to calculate 20% of a value N, you can use the formula:
//(20 / 100.0) * N (or 0.2 * N).

import java.text.DecimalFormat;
import java.util.Scanner;

public class SoftwareSales
{
	public static void main(String[] args)
	{

    //Set up format for money (ex. $00.00)
    DecimalFormat money = new DecimalFormat("####.00");
   
    //Initialize Scanner for keyboard input
    Scanner keyboard = new Scanner(System.in); 
    
    //Initialize variables
    int packages_purchased = 0; 
    double discountPercent = 0;
    double total = 99.00;
   
    //Display for Entry of packages
    System.out.print("Enter number of packages purchased: "); 
		    if (keyboard.hasNextInt())  { 
			    packages_purchased = keyboard.nextInt (); 
		    }
            //Display for if no packages
            else {
			    System.out.println("You must enter number"); 
			    System.exit(1); 
		    }
        
        //Display if packages purchased is 0
        if (packages_purchased == 0) {
            System.out.println("Your discount is: $0.00");
            System.out.println("Your total is: $0.00" );
            System.exit(0);
         }

      
        //Initialize calculation if total less than 0
        if (packages_purchased <10) {
            System.out.println("Your discount is: $0.00");
            System.out.println("Your total is: $" + money.format(packages_purchased * total));
            System.exit(0);
         }
         
        //Algorithms for packages purchase amounts with discount
        else if (packages_purchased >= 100)
             {discountPercent = 0.5;}
        else if (packages_purchased >= 50 && packages_purchased <= 99)
            {discountPercent = 0.4;}
        else if (packages_purchased >= 20 && packages_purchased <= 49)
            {discountPercent = 0.3;}
        else if (packages_purchased >= 10 && packages_purchased <= 19)
            {discountPercent = 0.2;}
      
        //Algorithms for calculations of discount and cost
        double discount = packages_purchased * total * discountPercent;
        double cost = (packages_purchased * total) - discount;
            
        //Display for total discount and total cost
        System.out.println("Your discount is: $" + money.format(discount));
        System.out.println("Your total is: $" + money.format(cost));
   }
}
