import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		/*
		 * 8 primitive data types:
		 * byte = 8-bit two's complement integer (-128, 127)
		 * short = 16-bit integer (-32,768, 32,767)
		 * int = 32-bit integer (-2^31, (2^31) - 1)
		 * long = 64-bit integer (-2^63, (2^63) - 1)
		 * float = single precision 32-bit floating point number--use in place of double when saving memory
		 * double = double precision 64-bit floating point number
		 * boolean = two values: true or false
		 * char = 16-bit Unicode character to represent a single character
		 * 
		 * Variable: a location in memory with a specified type
		 */

    System.out.println("Enter the name of a well-known person.");
    String name = scan.nextLine();

    System.out.println("Enter a place.");
    String location = scan.nextLine();

    System.out.println("Enter a measure of time (i.e. seconds, years, "
				+ "millenia)"); // prompt user
    String timeMeasure = scan.nextLine();

    System.out.println("Enter a whole number.");
    int num1 = scan.nextInt();

    scan.nextLine(); // scan enter "input" to get to string

    System.out.println("Enter an adjective.");
    String adjOne = scan.nextLine();
		
    System.out.println("Enter a food.");
    String breakfast = scan.nextLine();
		
    System.out.println("Enter an adverb.");
    String advOne = scan.nextLine();
		
    System.out.println("Enter an activity ending in -ing.");
    String activity = scan.nextLine();

    System.out.println(name + " had just entered " + location
				+ ", but it" + " felt more like it had been 30 " + timeMeasure
				+ ". " + name + "'s " + num1
				+ " dogs were uncharacteristically " + adjOne + " "
				+ "that morning. Not only was the breakfast of " + breakfast + " " + advOne + " bland, but it "
						+ "wasn't going to provide enough energy for " + activity + ".");
		
    System.out.println("henrythebernedoodle".substring(0, 5)); //prints henry
		  
    Dog henry = new Dog(); // creates Dog object
    henry.getSize();
    henry.setBreed("Bernedoodle");
		  
    System.out.println("Enter first name");
    String A = scan.next();
    System.out.println("Last name"); 
    String B = scan.next(); 
    int lenA = A.length(); 
    int lenB = B.length(); 
    int sum = lenA + lenB; 
    String aCap = A.substring(0, 1).toUpperCase() + A.substring(1); 
    String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);
    System.out.println(sum);
    if (A.compareTo(B) < 0) {
      System.out.println("Yes");
    } else { 
    	System.out.println("No"); 
    }
    System.out.println(aCap + " " + bCap); 

    // ctrl + shift + f will format code
		
    for(int i = 0; i <10; i++) {
      int square = i * i;
      System.out.println(i + " squared is " + square + ".");
    }
		
    System.out.println("Enter a whole number.");
    int int1 = scan.nextInt();
    if(int1 % 2 == 0) {
      System.out.println("This number is even.");
    } else {
      System.out.println("This number is odd.");
    }
    
    System.out.println("Enter your dog's weight in pounds.");
    int dogWeight = scan.nextInt();
    if (dogWeight - 30 < 0) {
    	System.out.println("That's actually a cat.");
    } else {
    	System.out.println("Good dog!");
    }
    
    System.out.println("Total meal cost calculator:");
    System.out.println("Enter the cost of a meal.");
    System.out.println("Enter the percent tip you'd like to add.");
    System.out.println("Enter your state's sales tax rate.");
    double meal_cost = scan.nextDouble();
    int tip_percent = scan.nextInt();
    int tax_percent = scan.nextInt();
    
    double mealTip = meal_cost * (tip_percent/100.0);
    double mealTax = meal_cost * (tax_percent/100.0);
    double mealTotal = meal_cost + mealTip + mealTax;
    int mealTotalRound = (int) Math.round(mealTotal);
    System.out.println("The total meal cost is " + String.valueOf(mealTotalRound) + " dollars.");
    
    double decPercent = 0.03;
    double investAmount = 1000;
    double earned;
    earned = calculateGrowth(decPercent, investAmount);
    // Method call above
    // Argument = decPercent, investAmount
    System.out.println("Your balance after one year is " + earned);

    scan.close();
  }
  
  public static double calculateGrowth(double rate, double input) {
    return rate * 100 * input;
    // Method = calculateGrowth()
    // Parameters = rate, input
    // Header = public static double calculateGrowth(rate, input)
  }
  
}

class Dog {
	private double size;
	
	public double getSize() {
		return size;
	}
	
	public void setBreed(String b) {
		String breed = b;
	}
}