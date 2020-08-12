package collections;

class Subject {
}

class Java extends Subject {
}

class Python extends Subject {
}

class Trainer<T> {
	T subject;
}

/*
 * 
 * why we need generic types ?
 * 
 * 
 * ==> to fix type-safety issue
 * 
 */

public class GenericType_Ex {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<>();
		javaTrainer.subject = new Java();

		Trainer<Python> pythonTrainer = new Trainer<>();
		pythonTrainer.subject = new Python();

		// ---------------------------------------------------
//		javaTrainer.subject = new Python(); // Type-safety
		// ---------------------------------------------------

		// ---------------------------------------------------
		// java classroom
		// ---------------------------------------------------
		Java java = javaTrainer.subject;
		System.out.println("all is well");

	}

}
