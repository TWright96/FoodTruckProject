package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();

		fta.run();

	}

	public void run() {

		for (int i = 0; i < fleet.length; i++) {
			Scanner kb = new Scanner(System.in);
			System.out.println("Food truck name: ");

			String name = kb.nextLine();

			if (name.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.println("Food truck rating: ");
			int rate = kb.nextInt();

			System.out.println("Food Type: ");
			String food = kb.next();

			FoodTruck ft = new FoodTruck(name, rate, food);

			fleet[i] = ft;

		}

		int select;

		do {
			menu();
			select = sc.nextInt();
			if (select == 1) {
				getList();
			}
			if (select == 2) {
				getAverage();
			}

			else if (select == 3) {

				getHighestRating();
			}

			else if (select == 4) {
				System.out.println("Goodbye");
			}
		} while (select != 4);

	}

	public void menu() {
		System.out.println("Please select an option: ");
		System.out.println("1.List all food trucks ");
		System.out.println("2.See the average ratings");
		System.out.println("3.Display the highest-rated food truck.");
		System.out.println("4.Quit");

	}

	public void getList() {

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				System.out.println(fleet[i].toString());
			}
		}
	}

	public void getAverage() {
		double avg = 0;
		int i = 0;
		int counter = 0;
		for (i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {

				counter++;
				avg = avg + fleet[i].getRating();
			}
		}
		System.out.println("The average average rating of food trucks is: " + avg / counter);

	}

	public void getHighestRating() {
		FoodTruck big = new FoodTruck();
		int t;
		for (t = 0; t < fleet.length; t++) {
			if (fleet[t] != null) {
				if (fleet[t].getRating() > big.getRating()) {
					big = fleet[t];
				}
			}
		}
		System.out.println(big);

	}

}
