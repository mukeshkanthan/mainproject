package niit.backend.dao;

import java.util.List;

import niit.backend.model.Employee;

public interface Employeedao {
	

	public List<Employee> getemplist(); 
	public Employee getemp(int empid); 
	public boolean addemp(Employee emp); 
	public boolean updateemp(Employee emp);
	 public boolean deleteemp(int empid); 
	public Employee findById(int empid);
	

}