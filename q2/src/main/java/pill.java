package q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class pill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		
		EmployeeService es=ctx.getBean("emp",EmployeeService.class);
		es.printAppName();
		es.printMap();
		
	}

}
