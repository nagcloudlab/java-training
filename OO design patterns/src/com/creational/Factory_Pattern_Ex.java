package com.creational;

interface Food {
}

class VegFood implements Food {

}

class NonVegFood implements Food {

}

class FoodFactory {

	public static Food getFood(String choice) {
		Food food = null;
		// pre work..
		if (choice.equals("veg"))
			food = new VegFood();
		if (choice.equals("non-veg"))
			food = new NonVegFood();
		// post work..

		return food;
	}
}

public class Factory_Pattern_Ex {

	public static void main(String[] args) {

		// ------------------------------------
		// Room-1
		// ------------------------------------

		// p1
		Food food = FoodFactory.getFood("veg");
//		if (food instanceof VegFood) {
//			System.out.println("yes..");
//		}

		// p2
		food = FoodFactory.getFood("non-veg");

		// ------------------------------------
		// Room-2
		// ------------------------------------

	}

}
