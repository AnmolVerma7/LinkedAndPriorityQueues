package Application;

import Model.LinkedQueue;
import Model.PriorityQueue;
import java.util.Scanner;

/**
 * Main class that runs Linked and Priority Queues
 * @authors Anmol Verma and Sean Tocheniuk
 */
public class RunQueues {
	
	// Scanner object for input
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		
		// Linked Queue Object
		LinkedQueue<String> LQ = new LinkedQueue<>();
		
		// Priority Queue Object
		PriorityQueue<String> PQ = new PriorityQueue<>();
		
		// Prints logo of program
		logo();
		
		// Asks user for number of names to be entered
		int queueSize = numberOfNames();
		
		// Loop that asks the user for names and adds to both Queues
		for (int i = 0; i < queueSize; i ++) {
			String name = askName();
			LQ.enqueue(name);
			PQ.enqueue(name);
		}
		
		queuePrinter(LQ, PQ);
		
		// Loop that removes 2 elements from each Queue
		for (int i = 0; i < 2; i++) {
			LQ.dequeue();
			PQ.dequeue();
		}
		
		queuePrinter(LQ, PQ);
	}
	
	/**
	 * Prints logo of application
	 */
	public static void logo() {
		System.out.println("		****************************************");
		System.out.println("		*WELCOME TO LINKED AND PRIORITY QUEUES!*");
		System.out.println("		****************************************");
	}
	
	/**
	 * Asks user for number of names they want to enter into Queue
	 * @return Size of the queue
	 */
	public static int numberOfNames() {
		System.out.print("\nHow many names would you like to add to the list? ");
		int number = 0;
		while (true) {
			if (input.hasNextInt()) {
				number = input.nextInt();
				if (number < 1) {
					System.out.print("\nPlease choose a number greater than or equal to 1. \n");
					System.out.print("\nEnter Queue size: ");
					input.nextLine();
				}
				else {
					break;
				}
			}
			else {
				System.out.print("\nSize of list may only be an integer number. \n");
				System.out.print("\nEnter Queue size: ");
				input.nextLine();
			}
		}
		input.nextLine();
		return number;
	}
	
	/**
	 * Asks user name and returns as string
	 * @return name that the user enters
	 */
	public static String askName() {
		System.out.print("\nPlease enter a name: ");
		String name = input.nextLine();
		return name;
	}

	/**
	 * Prints Linked and Priority Queues
	 * @param Linked Queue to be printed
	 * @param Priority Queue to be printed
	 */
	public static void queuePrinter(LinkedQueue<String> LQ, PriorityQueue<String> PQ) {
		try {
			LQ.printQueue();
			PQ.printQueue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
