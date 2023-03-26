package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private double rating;
	private String foodType;
	static int nextTruckId = 1234;
	private int truckId;

	public FoodTruck() {

	}

	public FoodTruck(String nm, double rate, String foodtype) {
		name = nm;
		rating = rate;
		this.foodType = foodtype;

		this.truckId = nextTruckId;
		nextTruckId++;
	}

	// create getters and setters
	public String getName() {
		return name;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rate) {
		this.rating = rate;
	}

	public void getAverage(double rate) {

	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

//create toString
	@Override
	public String toString() {
		return "FOODTRUCK Name: " + name + "\tRating:" + rating + " \nFood type: " + foodType + " \tTruckID: "
				+ truckId;
	}

}
