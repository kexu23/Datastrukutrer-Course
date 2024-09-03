package queue;

import java.util.Scanner;

public class RepeatStrings2 {
	
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    QueueInterface<String> queue;
    queue = new LinkedQueue<String>();
    
    String line;
    
    for (int i = 1; i <= 3; i++) {
      System.out.print("Enter a line of text > ");
      line = input.nextLine();
      queue.enqueue(line);
    }
    	 
    System.out.println("\nOrder is:");
    while (!queue.isEmpty()) {
      line = queue.dequeue();
      System.out.println(line);
    }
  }
}