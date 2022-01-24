import java.util.Stack;
import java.util.Scanner;

/**
 * 
 * Program created to test various strings if they are palindromes
 * by using a stack 
 * @author arufus
 * CS215-ON: Assignment 2.2
 *
 */
public class PalindromeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		Stack<Object> stack = new Stack<Object>();
		
		System.out.println("------TESTING STRINGS FOR PALINDROMES------");
		
		/*
		 * Five strings are tested: "racecar", "kayak", "rotator",
		 * "dogodog", "hottop"
		 * 
		 * A while loop was used to allow a user to test out
		 * five strings consistently before the program stops
		 */
		
		int count = 0;
		while (count < 5) {
			System.out.println("Check if your word or phrase is a palindrome! ");
			String testPal = scan.nextLine();
			testPal.toLowerCase();
			
			/*
			 *The for loop will take each character of the inserted string
			 *and push them into a stack 
			 */
			
			for (int i = 0; i < testPal.length(); i++) {
				stack.push(testPal.charAt(i));
			} //end for loop
		
			String newPal = "";
		
			/*
			 *The while loop take each character out of the stack
			 *to create the new string 
			 */
			
			while (!stack.empty()) {
				newPal.toLowerCase();
				newPal += stack.pop();
			} //end inner while loop
		
			/*
			 * The if-else loop will compare the original string
			 * to the new string to confirm if we have a 
			 * palindrome
			 */
			
			if (testPal.equals(newPal)) {
				System.out.println(newPal + " is a palindrome, great job!");
			} else {
				System.out.println("Whoops! " + newPal + " is not the same forward & reverse.");
			} //end if-else loop
			
			count++;
		} //end outer while loop
		System.out.println("Thank you for testing out your strings for palindromes.");
		
	} //end main

} //end PalindromeApplication
