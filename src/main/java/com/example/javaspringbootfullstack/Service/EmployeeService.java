package com.example.javaspringbootfullstack.Service;

import com.example.javaspringbootfullstack.Dao.EmployeeRepository;
import com.example.javaspringbootfullstack.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        try{
            return employeeRepository.findAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public Employee findById(Integer id) {
       try{
           Optional<Employee> employee = employeeRepository.findById(id);
           System.out.println("############### Find User By ID (In Console) ###############");
           System.out.println(employee);
           return employee.get();
       }catch (Exception e){
           System.out.println(e);
       }
       return null;
    }

    public void insert(Employee employee) {
        try{
            employeeRepository.save(employee);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void update(Integer id ,Employee employee){
        Employee em =  employeeRepository.findById(id).get();
        em.setFirst_name(employee.getFirst_name());
        em.setEmail(employee.getEmail());
        em.setLast_name(employee.getLast_name());
        em.setPassword(employee.getPassword());
        em.setSalary(employee.getSalary());
        employeeRepository.save(em);
    }

    public void delete(Integer id){
        employeeRepository.deleteById(id);
    }


}
