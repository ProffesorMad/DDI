package com.concretepage.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.concretepage.domain.Employee;
@Service
public class EmployeeService {
   public List<Employee> getAllEmployee() {
	   List<Employee> list = new ArrayList<>();
	   list.add(new Employee(1, "Kiara", "Lima"));
	   list.add(new Employee(2, "Pablo", "Zaragoza"));
	   list.add(new Employee(3, "Karla", "Quito"));
	   return list;
   }
}