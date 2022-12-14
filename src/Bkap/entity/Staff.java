package Bkap.entity;

import java.util.Scanner;

public class Staff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		khoi tao nhan vien 1
		Employee staff = new Employee("B12312", "dinh van can", 23, 4, 0, false);
		staff.calSalary();
//		in ra nhan vien 1
		staff.outputData();
		
//		khoi tao nhan vien 2
		
		Employee staff2 = new Employee();
		System.out.println("moi ban nhap vao ma nhan vien: ");
		staff2.setId(sc.nextLine());
		System.out.println("moi ban nhap vao ho va ten nhan vien: ");
		staff2.setName(sc.nextLine());
		System.out.println("moi ban nhap vao tuoi nhan vien: ");
		staff2.setAge(sc.nextInt());
		System.out.println("moi ban nhap vao luong nhan vien: ");
		staff2.setSalary(sc.nextFloat());
		System.out.println("moi ban nhap vao he so luong nhan vien: ");
		staff2.setRate(sc.nextFloat());
		System.out.println("moi ban nhap vao status nhan vien: ");
		staff2.setStatus(sc.nextBoolean());
		staff2.calSalary();
		staff2.outputData();
		
//		khoi tao nhan vien 3
		Employee staff3 = new Employee();
		staff3.inputdata();
		staff3.calSalary();
		staff3.outputData();
	}

}
