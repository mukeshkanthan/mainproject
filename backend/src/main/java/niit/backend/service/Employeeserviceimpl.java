package niit.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import niit.backend.dao.Employeedao;
import niit.backend.model.Employee;

@Service
@Repository("empService")
@Transactional


public class Employeeserviceimpl implements Employeeservice
{
  
	@Autowired
	private Employeedao empDAO;
	
    @Override
	public List<Employee> getemplist() {
		// TODO Auto-generated method stub
		return empDAO.getemplist();
	}
     
    @Override
	public Employee getemp(int empid) {
		// TODO Auto-generated method stub
		return empDAO.getemp(empid);
	}

    @Override
	public boolean addemp(Employee emp) {
		// TODO Auto-generated method stub
		
	   return empDAO.addemp(emp);
	}
    
    @Override
	public boolean updateemp(Employee emp) {
		
		return empDAO.updateemp(emp);
	}
	
    @Override
	public boolean deleteemp(int empid) {
		
		return 	empDAO.deleteemp(empid);
		}

    @Override
	public Employee findById(int empid) {
		// TODO Auto-generated method stub
				return empDAO.findById(empid);
	}
}
