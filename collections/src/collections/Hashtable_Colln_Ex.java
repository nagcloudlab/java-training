package collections;

import java.util.HashSet;
import java.util.Set;

class Car {

	String model;
	int year;

	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	
	
}

public class Hashtable_Colln_Ex {

	public static void main(String[] args) {

		Car car1 = new Car("mode-1", 2020);
		Car car2 = new Car("mode-1", 2020);

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		System.out.println(car1.equals(car2));

		Set<Car> cars = new HashSet<Car>();
		cars.add(car1);
		cars.add(car2);

		System.out.println(cars.size());

	}

}
