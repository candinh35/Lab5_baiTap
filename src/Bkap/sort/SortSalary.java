package Bkap.sort;

import java.util.ArrayList;
import java.util.Iterator;

import Bkap.entity.Employee;

public class SortSalary {
	
	
	public static void main(String[] args) {
		int n = 2;
		ArrayList<Employee> employees = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Employee newEmployee = new Employee();
			newEmployee.inputdata(employees);
		}
		for (Employee employee : employees) {
			employee.outputData();
		}
	}
}
