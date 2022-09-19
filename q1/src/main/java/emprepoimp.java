package DataLayer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import users.Employee;

@Repository
public class emprepoimp implements emprepo{
	
	
	
	   
		public boolean insertEmployeeDetails(Employee emp) {
			// TODO Auto-generated method stub
	boolean ans=false;
			
			EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
			
			em.getTransaction().begin();
			
			em.persist(emp);
			
			em.getTransaction().commit();
			ans=true;
			
			em.close();
			
			return ans;
		}

		
		public List getAllEmployeeDetails() {
			// TODO Auto-generated method stub
			List<Employee> ans=new ArrayList<>();
			EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();

			         Query q= em.createQuery("from Employee");
			          ans=q.getResultList();
					
					
					return ans;
		}

		
		public Employee findEmployee(int empId) {
			// TODO Auto-generated method stub
	Employee emp=null;
			
			EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
			
			emp=em.find(Employee.class, empId);
			
			return emp;
		}

		
		public String deleteEmployeeDetailsById(int empId) {
			// TODO Auto-generated method stub
		     String ans="not found";
				
				EntityManager em= Persistence.createEntityManagerFactory("employeeUnit").createEntityManager();
				
				Employee emp=em.find(Employee.class, empId);
			
					em.getTransaction().begin();
					em.remove(emp);
					em.getTransaction().commit();
					ans="removed";
				
				return ans;
		}

			
		
}

	


