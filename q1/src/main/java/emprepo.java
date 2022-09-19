package DataLayer;

import java.util.List;

import users.Employee;

public interface emprepo {

	
	public boolean insertEmployeeDetails(Employee emp);
	
	
	public List getAllEmployeeDetails();
	
	
	public Employee findEmployee(int empId);
	
	
	public String deleteEmployeeDetailsById(int empId);	
}
