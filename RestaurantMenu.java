package com.omar.restaurant;
import java.util.Scanner;

public class RestaurantMenu {
	private static Scanner sc = new Scanner(System.in);
	private static int editMenu() {
		System.out.println("0.Exit");
		System.out.println("1.Create a menu");
		System.out.println("2.Show menu");
		System.out.println("3.Add new food item");
		System.out.println("4.Remove a food item");
		System.out.println("5.Modify a food item");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	private static void createMenu(FoodItem[] menu) {
		for(int i=0;i<menu.length;i++) {
			menu[i] = new FoodItem();
			System.out.print("Enter 1st food item name: ");
			String food = sc.nextLine();
			menu[i].setName(food);
			System.out.print("Enter price for "+food+": ");
			double price = sc.nextDouble();
			menu[i].setPrice(price);
			sc.nextLine();
		}
		
	}
	
	private static void showMenu(FoodItem[] menu) {
		int i=1;
		for(FoodItem item: menu) {
				if(item!=null) {
				System.out.printf(i+"."+item.getName()+"  		Rs."+item.getPrice());
				System.out.println();
			}
			i++;
		}
	}
	
	private static void addFoodItem(FoodItem[] menu, int pos) {
		menu[pos]= new FoodItem();
		System.out.print("Enter name of food: ");
		String food = sc.nextLine();
		menu[pos].setName(food);
		System.out.print("Enter price for "+ food+": ");
		double price = sc.nextDouble();
		menu[pos].setPrice(price);
	}
		
	public static boolean removeFoodItem(FoodItem[] menu, String name) {
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
	
	private static boolean modifyFoodItem(FoodItem[] menu, String name2) {
		FoodItem item =null;
		for(int i=0; i<menu.length; i++) {
			if(menu[i]!=null) {
				if(menu[i].getName().equals(name2)) {
					item = menu[i];
					break;
				}
				else {
					continue;
				}
			}
		}
		if(item==null) {return false;}
		System.out.print("1.Price\n2.Name\nWhat do you want to modify?");
		if(sc.nextInt()==1) {
			System.out.print("Enter new price: ");
			item.setPrice(sc.nextInt());
		}
		else {
			System.out.print("Enter new name: ");
			item.setName(sc.nextLine());
		}
		
		return true;
	}

	public static void main(String args[]) {
		FoodItem [] menu = new FoodItem[2];
		int choice;
		do {
			choice = RestaurantMenu.editMenu();
			switch(choice) {
			case 1:
				RestaurantMenu.createMenu(menu);
				break;
			case 2:
				RestaurantMenu.showMenu(menu);
				break;
			case 3:
				System.out.print("Enter position in menu: ");
				int pos = sc.nextInt();
				RestaurantMenu.addFoodItem(menu, pos);
				break;
			case 4: 
				System.out.print("Enter name of item to be removed: ");
				String name1 = sc.nextLine();
				boolean b1 = RestaurantMenu.removeFoodItem(menu,name1);
				if(b1) 
					System.out.println("Food item removed successfully!");
				else
					System.out.println("Item not found");
				break;
			case 5:
				System.out.print("Enter name of item to be modified: ");
				String name2 = sc.nextLine();
				boolean b2 = RestaurantMenu.modifyFoodItem(menu, name2);
				if(b2)
					System.out.println("Item modified successfully!");
				else
					System.out.println("Item not found!");
				break;
			}
			
			}while (choice!=0);
			
		}

	}

