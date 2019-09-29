package edu.rsi.game.utils;

import java.util.ArrayList;
import java.util.List;

import edu.rsi.game.models.Employee;


public class Data {
	public static List<Employee> employees() {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("mohamed", "Developer", 100);
		Employee e2 = new Employee("sherazad", "Developer", 100);
		Employee e3 = new Employee("philippe", "Project Manager", 150);
		Employee e4 = new Employee("omar", "Developer", 150);
		Employee e5 = new Employee("paul", "Developer", 100);
		Employee e6 = new Employee("gregory", "Functional", 700);
		Employee e7 = new Employee("ahmad", "Developer", 900);
		Employee e8 = new Employee("celine", "Developer", 900);
		Employee e9 = new Employee("michel", "don t know", 900);
		Employee e10 = new Employee("hervé", "MOA", 900);
		Employee e11 = new Employee("jean-christophe", "Developer", 1000);
		Employee e12 = new Employee("aude", "Project Manager", 900);
		Employee e13 = new Employee("laurent", "Project Manager", 1000);
		Employee e14 = new Employee("noureddine", "null", 1100);
		Employee e15 = new Employee("thierry", "project Manager", 1000);
		Employee e16 = new Employee("shrek", "don t know", 1000);
		Employee e17 = new Employee("lionel", "null", 900);
	

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		employees.add(e11);
		employees.add(e12);
		employees.add(e13);
		employees.add(e14);
		employees.add(e15);
		employees.add(e16);
		employees.add(e17);


		return employees;
	}
}
