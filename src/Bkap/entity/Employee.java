package Bkap.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStatus;
	
	public Employee() {
		
	}
	
	public Employee(String employeeId, String employeeName, 
			int age, float rate, float salary, boolean employeeStatus) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
	}
	
	public void setId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public void setStatus(Boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	
	
//	phuong thuc getter
	public String getId() {
		return employeeId;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public int getAge() {
		return age;
	}
	public float getRate() {
		return rate;
	}
	public float getSalary() {
		return salary;
	}
	
	public boolean getStaus() {
		return employeeStatus;
	}
	
//	phuong thuc inputData
	
	public void inputdata(ArrayList<Employee> staff) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap employee id:");
		employeeId = sc.nextLine();
		System.out.println("Nhap employee name:");
		employeeName = sc.nextLine();
		System.out.println("Nhap employee age:");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap employee Rate:");
		rate = sc.nextFloat();
		System.out.println("Nhap status:");
		employeeStatus = sc.nextBoolean();
	}
	
	public void outputData() {
		System.out.println("Employee's code is: " + this.employeeId);
		System.out.println("Employee's first and last name is: " + this.employeeName);
		System.out.println("Employee's Age is: " + this.age);
		System.out.println("Employee's Salary is: " + this.salary);
		System.out.println("Employee's Rate is: " + this.rate);
		System.out.println("Employee's Status is: " + this.employeeStatus);
	}
	
	public float calSalary() {
		return this.salary = this.rate * 1300000;
	}

	
}
