//2.8: Cookie Calories
//A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 servings in the bag and that a serving equals 300 calories. Write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.

import java.util.Scanner;

public class CookieCalorieCounter{

  public static void main(String[] args){
    
    int	cookies;
    int  calories;


    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter number of cookies eaten: ");
    cookies = keyboard.nextInt();

    calories = cookies * 75 ;

    System.out.println("Your calorie intake was: " + calories + " calories.");

  }
}
