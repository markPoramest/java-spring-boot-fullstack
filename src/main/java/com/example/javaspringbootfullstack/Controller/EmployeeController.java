package com.example.javaspringbootfullstack.Controller;

import com.example.javaspringbootfullstack.Service.EmployeeService;
import com.example.javaspringbootfullstack.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/findbyId/{id}")
    public Employee show(@PathVariable String id) {
        return employeeService.findById(Integer.parseInt(id));
    }
    @PostMapping("/insert")
    public void insert(@RequestBody Employee employee){
        System.out.println(employee);
        employeeService.insert(employee);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable String id , @RequestBody Employee employee){
        employeeService.update(Integer.parseInt(id),employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        employeeService.delete(Integer.parseInt(id));
    }

}
