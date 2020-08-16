package com.coderscampus.arraylist;

import java.util.Random;
import java.util.Scanner;

public class CustomListApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random randomNumber = new Random();
		
		
		CustomList<Integer> integers = new CustomArrayList<>(); 
		
		System.out.print("Enter number of elements to be added: ");
		Integer numberOfElements = scanner.nextInt();

		for (int i = 0; i < numberOfElements; i++) {
			integers.add(randomNumber.nextInt(1000));
		}
		
		outputList(integers);
		
//new code for this assignment
		
		System.out.println("\n--------\n");
		
//add element at index		
		System.out.print("_Add element at index_\nEnter a number (int): ");
		Integer addNumber = scanner.nextInt();
		System.out.print("Enter the index at which \"" + addNumber + "\" should be added to the list: ");
		Integer indexOfNumber = scanner.nextInt();
		
		try {
			integers.add(indexOfNumber, addNumber);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("\n+++++ ERROR: that index doesn't exist! +++++");
		}
		
//output updated list		
		outputList(integers);
		
		System.out.println("\n--------\n");
		
//remove element at index		
		System.out.print("_remove element_\nEnter the index at which the element should be removed: ");
		Integer indexRemoveElement = scanner.nextInt();
		
		try { 
			Integer removedItem = integers.remove(indexRemoveElement);
			if (removedItem != null) {
				System.out.println("\nElement \"" + removedItem + "\" at index " + indexRemoveElement + " has been removed from the list.");
			}			
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("\n+++++ ERROR: that index doesn't exist! +++++");
		}
		
		
//output updated list		
		outputList(integers);
			
		scanner.close();
	}

	private static void outputList(CustomList<Integer> integers) {
		System.out.println("\nElements in CustomArrayList (Integers):\n");
		for (int i = 0; i < integers.getSize(); i++) {
			System.out.println("index " +i + " : " + integers.get(i));
		}
	}

}
