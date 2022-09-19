package presentationlayer;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import servicelayer.EmployeeService;
import user.EmployeeException;
import users.Employee;

@Component
public class pbean {
	
	@Autowired
	private EmployeeService empService; //dependency
	
	
	public void insertEmployee(){
	//take the input from the user (Employee Details without empId, empId should be
//	generated automatically)and call the saveEmployee method on the
	//empService object.
		Employee em=null;
		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		String add=s1.next();
		int salary=s1.nextInt();
		
		em.setEmpName("abbas");
		em.setEmpAddress("raj");
		em.setSalary(5869);
		
		empService.saveEmployee(em);
	}
	public void printAllEmployee(){
	//call the getAllEmployee method on the empService object and print all the
	//employee details.
		
		List<Employee> list=empService.getAllEmployee();
		System.out.println(list);
	}
	public void searchEmployee(){
	// take the empId from the user and call the getEmployeeById method on the
	//empService obj. And print the appropriate details.
		Employee em=null;
		Scanner s1=new Scanner(System.in);
		int id=s1.nextInt();
		try {
			em=empService.getEmployeeById(1);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(em);
	}
	public void deleteEmployee(){
	// take the empId from the user and call the deleteEmployeeById method on the
	//empService obj. And print the appropriate details.
		Scanner s1=new Scanner(System.in);
		int id=s1.nextInt();
		String  em="";
		try {
			em=empService.deleteEmployeeById(1);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(em);
	}
	}


