/*
 * Create a program that declares several variables of different data types, 
 * including at least one variable of each of the following types: 
 * int, double, char, and boolean.
 */
public class Exercise2 {
	public static void main(String[] args) {
		// Product
		// Assign values to each of the variables.
		int id = 13; 
		String name = "Apple Iphone 13 Pro Silicon Case - Red";
		double price = 9.99;
		char qualityIndex = 'B';
		boolean isActive = true;
		
		// Print the value of each variable to the console
		System.out.println(id);
		System.out.print(name);
		System.out.println(price);
		System.out.print(qualityIndex);
		System.out.print(isActive);
		
		// Modify the values of the variables
		id = 14;
		name = "Apple Iphone 14 Silicon Case - Pink";
		price = 12.99;
		qualityIndex = 'A';
		isActive = false;
		
		// print the new values
		System.out.println(id);
		System.out.print(name);
		System.out.println(price);
		System.out.print(qualityIndex);
		System.out.print(isActive);
		
		// Use at least one type casting operation in the program
		id = (int) price;
		System.out.println(id);
		
		// Use at least one mathematical operation
		price = price + id;
		System.out.println(price);
		
		// Use at least one comparison operator
		isActive = id <= price;
		System.out.print(isActive);
		
		// Use at least one control flow statement
		if(isActive) {
			System.out.print("Product is active.");
		} else {
			System.out.print("Product is inactive.");
		}
	}
	
}
