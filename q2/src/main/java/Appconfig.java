package q2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("a1.properties")
@ComponentScan(basePackages = "q2")
public class Appconfig {

	@Bean("em")
	public List<Employee> getemp(){
		
		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(1,"abbas","raj",576));
		emp.add(new Employee(2,"aas","raj",576));
		emp.add(new Employee(3,"abas","raj",576));
		emp.add(new Employee(4,"abbs","raj",576));
		emp.add(new Employee(5,"abba","raj",576));
		
		
		
		return emp;
		}

	@Bean("map")
	public Map<Department,Employee> getdata(){
		
		Map<Department,Employee> map=new LinkedHashMap<Department,Employee>();
		
		map.put(new Department(1,"hr","location"),new Employee(1,"abbas","raj",576));
		map.put(new Department(2,"marketing","location"),new Employee(3,"abbas","raj",576));
		map.put(new Department(3,"sales","location"),new Employee(3,"abbas","raj",576));
		
		
		
		
		
		
		return map;
	}

	
	
}
