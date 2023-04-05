package com.omar.restaurant;
import java.util.Scanner;

public class RestaurantMenu {
	private static Scanner sc = new Scanner(System.in);
	private static int showOptions() {
		System.out.println("1.Show current menu");
		System.out.println("2.Add New dish");
		System.out.println("3.Remove dish");
		System.out.println("4.Modify dish");
		System.out.println("5.Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	private static void currentMenu(FoodItem[] menu) {
		for(FoodItem dish: menu) {
			if(dish!=null) {
				System.out.printf("Name: "+dish.getName());
				System.out.printf(" | Price: "+dish.getPrice());
				System.out.println();
			}
		}
		
	}
	
	private static boolean addNewDish(FoodItem[] menu, int pos) {
		if(menu[pos]==null) {
			System.out.print("Enter name of Dish: ");
			String name = sc.nextLine();
			System.out.print("Enter Price of Dish: ");
			double price = sc.nextDouble();
			sc.nextLine();
			menu[pos]=new FoodItem(name,price);
			return true;
		}
		return false;
	}

	private static boolean removeDish(FoodItem[] menu) {
		System.out.print("Enter name of Dish to be removed : ");
		String name = sc.nextLine();
		for(int i=0;i<menu.length;i++) {
			if(menu[i]!=null) {
				if(menu[i].getName().equals(name)) {
					menu[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean modifyDish(FoodItem[] menu, int pos) {
		if(menu[pos]!=null) {
			System.out.print("1.Name\n2.Price\nChoose field to be changed: ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.print("Enter new name of food item: ");
				String name = sc.nextLine();
				menu[pos].setName(name);
				return true;
			}
			else if(choice==2){
				System.out.print("Enter new price of food item: ");
				double price = sc.nextDouble();
				sc.nextLine();
				if(menu[pos]==null) {
					menu[pos].setPrice(price);
					return true;
				}
			}
		}
		return false;
	}
			
		
	public static void main(String[] args) {
		FoodItem[] menu = new FoodItem[5];
		int choice=RestaurantMenu.showOptions();;
		boolean b;
		int pos;
		while(choice!=5){
			switch(choice){
			case 1:
				RestaurantMenu.currentMenu(menu);
				break;
			case 2:
				System.out.print("Enter postion: ");
				pos = sc.nextInt();
				sc.nextLine();
				b = RestaurantMenu.addNewDish(menu,pos);
				if(b) 
					System.out.println("New dish added!");
				else
					System.out.println("Menu full!");
				break;
			case 3:
				b = RestaurantMenu.removeDish(menu);
				if(b)
					System.out.println("Dish removed!");
				else
					System.out.println("Dish not found!");
				break;
			case 4: 
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				sc.nextLine();
				b = RestaurantMenu.modifyDish(menu,pos);
				if(b)
					System.out.println("Dish modified");
				else
					System.out.println("Dish not found!");
				break;
			}
			choice = RestaurantMenu.showOptions();
		}
		System.out.println("Thanks!");
	}
}
