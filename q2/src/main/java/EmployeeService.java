package q2;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import users.Employee;


@Component(value = "emp")
public class EmployeeService {
	
      @Autowired
      @Qualifier("map")
		private Map<Department, Employee> theMap; // inject 3 entries
		
		
		@Autowired
		@Qualifier("em")
		private List<Employee> list; //inject List of 5 Employee object
		
		@Value("${name}")
		@Autowired
		private String appName; //inject the AppName from the properties file
		//Hint: Make use of @Bean annotation to inject theMap and theList;
		
		public void printMap(){
			//print all the employee's and their department's details from theMap
			for (Department key: theMap.keySet()){  
				System.out.println(key+ " = " + theMap.get(key));
			}
			}
		public void printList(){
			//sort the List of Employees according to the salary (make use of Lamda expression
	   // Collections.sort(list);
		}
		public void printAppName(){
			//print the injected appName
			System.out.println(appName);
			}


}
