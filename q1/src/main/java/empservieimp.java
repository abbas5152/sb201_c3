package servicelayer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import DataLayer.emprepo;
import DataLayer.emprepoimp;
import user.EmployeeException;
import users.Employee;


@Service
public class empservieimp implements EmployeeService {

	
	emprepoimp empp=new emprepoimp();
	@Override
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empp.insertEmployeeDetails(emp);
	}

	@Override
	public List getAllEmployee() {
		// TODO Auto-generated method stub
	return empp.getAllEmployeeDetails();
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		if(empp.findEmployee(empId)==null) {
			throw new EmployeeException("not found");
		}
		return empp.findEmployee(empId);
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		if(empp.deleteEmployeeDetailsById(empId)==null) {
			throw new EmployeeException("not found");
		}
	  return empp.deleteEmployeeDetailsById(empId);
	}
	}
	
	


