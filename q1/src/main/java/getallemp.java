package utility;

import servicelayer.EmployeeService;
import servicelayer.empservieimp;

public class getallemp {
	
	public static void main(String[] args) {
		EmployeeService emp=new empservieimp();
		
		System.out.println(emp.getAllEmployee());;
	}

}
