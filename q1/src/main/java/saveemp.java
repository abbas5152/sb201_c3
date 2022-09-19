package utility;

import servicelayer.EmployeeService;
import servicelayer.empservieimp;
import users.Employee;

public class saveemp {
	
	public static void main(String[] args) {
		 EmployeeService empp=new empservieimp();
		 
		 Employee em=new Employee();
		 em.setEmpName("abbas");
		 em.setEmpAddress("jam");
		 em.setSalary(27384);
		 
		 empp.saveEmployee(em);
	}

}
