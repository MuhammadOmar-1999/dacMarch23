package com.omar.arrayoperations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	private static Scanner sc = new Scanner(System.in);
	
	private static int[] acceptRecord(int[] arr) {
		System.out.print("Enter array length: ");
		int arrLength = sc.nextInt();
		arr = new int[arrLength];
 		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter "+ i +"th element of array: ");
			arr[i]=sc.nextInt();
		}
 		return arr;
	}

	private static void printRecord(int[] arr) {
		if(arr!=null) {
			System.out.println(Arrays.toString(arr));
		}
		else
			System.out.println("Array is empty!");
	}
	
	private static double calculateAverage(int[] arr) {
		int sum = 0;
		double average = 0;
		if(arr != null) {
			for(int i : arr) {
				sum = sum + i;
				}
			average = sum/arr.length;
		}
		else
			System.out.println("Array is empty!");
		return average;
		
	}
	
	private static int calculateSum(int[] arr) {
		int sum = 0;
		if(arr != null) {
			for(int i : arr) {
				sum = sum + i;
				}
		}
		else
			System.out.println("Array is empty!");
		return sum;
		
	}
	
	private static int findLargest(int[] arr) {
		if(arr!=null) {
			int largest = arr[0];
			for(int i=1; i<arr.length; i++) {
				if(largest<arr[i]) {
					largest = arr[i];
				}
			}
			return largest;
		}
		else
			System.out.println("Array is empty!");
		return 0;
		
	}
	
	private static int findSmallest(int[] arr) {
		if(arr!=null) {
			int smallest = arr[0];
			for(int i=1; i<arr.length; i++) {
				if(smallest>arr[i]) {
					smallest = arr[i];
				}
			}
			return smallest;
		}
		else
			System.out.println("Array is empty!");
		return 0;
	}
	
	private static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept record");
		System.out.println("2.Print record");
		System.out.println("3.Calculate sum");
		System.out.println("4.Calculate average");
		System.out.println("5.Find largest element");
		System.out.println("6.Find smallest element");
		System.out.println("7.Sort in ascending order");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		return choice;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = null;
		int choice;
		do{
			System.out.println();
			choice = ArrayOperations.menuList();
			switch(choice) {
			case 1:
				arr = ArrayOperations.acceptRecord(arr);
				break;
			case 2:
				ArrayOperations.printRecord(arr);
				break;
			case 3:
				int sum = ArrayOperations.calculateSum(arr);
				System.out.println("Sum of elements of array: "+sum);
				break;
			case 4:
				double average = ArrayOperations.calculateAverage(arr);
				System.out.println("Average of elements of array: "+average);
				break;
			case 5:
				int largest = ArrayOperations.findLargest(arr);
				System.out.println("Largest element of array: "+largest);
				break;
			case 6:
				int smallest = ArrayOperations.findSmallest(arr);
				System.out.println("Smallest element of array: "+smallest);
				break;
			case 7:
				if(arr!=null) {
					Arrays.sort(arr);
					System.out.println("Sorted array: "+Arrays.toString(arr));
				}
				else
					System.out.println("Array is empty!");
				break;
			default:
				System.out.println("Thanks!");
				break;
			}
		}while(choice!=0);
	}
}
