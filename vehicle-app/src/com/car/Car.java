package com.car;

import com.wheel.Wheel;


// single responsibility


public class Car {

	private Wheel wheel;  // interface segregation principle

	// dependency inversion principle
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("car moving");
	}

}
