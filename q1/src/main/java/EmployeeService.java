package servicelayer;

import java.util.List;

import user.EmployeeException;
import users.Employee;

public interface EmployeeService {
	public boolean saveEmployee(Employee emp);
	public List getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;


}
