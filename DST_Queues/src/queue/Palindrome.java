package queue;

import javax.swing.JOptionPane;

public class Palindrome {
	
	public static boolean test (String testString) throws StackOverFlowException, StackUnderFlowException {
		
		StackInterface<Character> stack = new ArrayStack<Character>(Character.class,testString.length());
		QueueInterface<Character> queue = new ArrayQueue<Character>(Character.class,testString.length());
		int numLetters = 0;
		char ch;
		
		for (int i = 0; i < testString.length(); i++) {
			// Parses out the character at index i in the teststring
			ch = testString.charAt(i);
			// The isLetter method in the Character class checks if a char is 
			// a letter (returns true) or not (returns false)
			if (Character.isLetter(ch)) {
				numLetters = numLetters + 1;
				// The toLowerCase method in the Character class changes 
				// all letters in the parameter to lowercase
				ch = Character.toLowerCase(ch);
				
				queue.enqueue(ch);
				stack.push(ch);
				
			}
			
		}
		
		boolean stillPalindrome = true;
		Character fromStack, fromQueue;
		int charCount = 0;
		
		while (stillPalindrome && (charCount < numLetters)) {
			// This data is stored in the stack and queue as the reference type Character and 
			// it is evaluated into a primitive value (char) using 
			// the charValue() method
			fromStack = stack.top();
			stack.pop();
			fromQueue = queue.dequeue();
			if (!fromStack.equals(fromQueue)) {
				stillPalindrome = false;
			}
			charCount++;
		}
		
		return stillPalindrome;
	}
	
	// Main method
	public static void main (String[] args) {


		String str = JOptionPane.showInputDialog("Enter string to be tested:");
		
		try{
			StringBuffer buf = new StringBuffer();
			buf.append("The string \"" + str  + "\" IS ");
			if (!test(str)) {
				buf.append("NOT ");
			}
			buf.append("a palindrome.");
			JOptionPane.showMessageDialog(null, buf.toString());
		}catch(StackOverFlowException e){
			System.out.println(e);
		}catch(StackUnderFlowException e){
			System.out.println(e);
		}
	}
}
			