package com;

import com.car.Car;
import com.wheel.CEATWheel;
import com.wheel.MRFWheel;

public class App {

	public static void main(String[] args) {

		// strategy design pattern ==> dynamic polymorphism ==> open closed principle
		
		Car car = new Car();
		car.setWheel(new MRFWheel());  // Liskov substitution principle

		car.move();

		car.move();

		car.move();

		car.setWheel(new CEATWheel());

		car.move();

		car.move();

		car.move();

	}

}
