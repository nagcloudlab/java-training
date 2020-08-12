package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Colln_App {

	public static void main(String[] args) {

//		List<Employee> employees = new ArrayList<Employee>();
		Set<Employee> employees = new TreeSet<Employee>((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		employees.add(new Employee(12312, "E1", 10000.00));
		employees.add(new Employee(34534, "E2", 20000.00));
		employees.add(new Employee(12234, "E4", 10000.00));
		employees.add(new Employee(76767, "E5", 70000.00));
		employees.add(new Employee(34545, "E3", 40000.00));

		// --------------------------------------------------

		// sort ==> compare --> swap

//		Collections.sort(employees); // Merge sorting algm
//		employees.forEach(System.out::println);

		// sort by salary
//		Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
//		employees.forEach(System.out::println);

		employees.forEach(System.out::println);

	}

}
