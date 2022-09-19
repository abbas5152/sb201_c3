import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Demo {
	
	void journey() {
		
		s.so();
		System.out.println("Journey on midway");
	}
	
	
	@Autowired
	@Qualifier("vv")
	private Shape s;
