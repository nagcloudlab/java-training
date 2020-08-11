package com.model;

public class Apple {

	private int weight = 0;
	private Color color;
	private String country;

	public Apple(int weight, Color color, String country) {
		this.weight = weight;
		this.color = color;
		this.country = country;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", country=" + country + "]";
	}

	
}
