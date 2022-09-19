package utility;

import servicelayer.EmployeeService;
import servicelayer.empservieimp;
import user.EmployeeException;

public class delete {
	public static void main(String[] args) {
		
		EmployeeService emp=new empservieimp();
		
		try {
			System.out.println(emp.deleteEmployeeById(2));;
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
