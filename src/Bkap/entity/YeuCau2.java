package Bkap.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class YeuCau2 {

	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int check, n = 0;
		do {
			 System.out.println("============== MENU ================");
	         System.out.println("1. Nhập thông tin cho n nhân viên");
	         System.out.println("2. Tính lương tất cả nhân viên");
	         System.out.println("3. Hiển thị thông tin tất cả nhân viên");
	         System.out.println("4. Sắp xếp nhân viên theo lương tăng dần");
	         System.out.println("5. Tìm kiếm nhân viên theo lương nhân viên");
	         System.out.println("6. Cập nhật trạng thái nhân viên theo mã nhân viên ");
	         System.out.println("7. Thoát");
	         System.out.println("Mời bạn nhập lựa chọn");
	         check = sc.nextInt();
	         if(check < 0 || check > 7) {
	        	 System.out.println("lua chon khong hop le vui long chon lai:");
	         }else {
	        	 switch (check) {
				case 1:
					 
	                    System.out.println("Nhập số lượng nhân viên muốn thêm : ");
	                    do {
	                       try {
	                           n = Integer.parseInt(sc.nextLine());
	                       }catch (Exception exp){
	                           continue;
	                       }
	                       if (n<=0){
	                           System.err.println("Số bạn vừa nhập không hợp lệ , vui lòng nhập 1 cố nguyên >0");
	                           continue;
	                       }
	                       break;
	                    }while (true);
					for (int i = 0; i < n; i++) {
						Employee newEmployee = new Employee();
						newEmployee.inputdata(staff);
					}
					break;
				case 2:
					for (Employee employee : staff) {
						employee.calSalary();
					}
					break;
				case 3:
					for (Employee employee : staff) {
						employee.outputData();
					}
					break;
				case 4:
					Collections.sort(staff,new Comparator<Employee>() {

						
						public int compare(Employee o1, Employee o2) {
							if(o1.getSalary() == o2.getSalary()) {
								return 0;
							}else if(o1.getSalary() > o2.getSalary()) {
								return 1;
							}else {
								return -1;
							}
						}
						
					});
					break;
				default:
					break;
				}
	         }
		} while (check != 7);
	}

}
