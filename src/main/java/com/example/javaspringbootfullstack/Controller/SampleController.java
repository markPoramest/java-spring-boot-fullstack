package com.example.javaspringbootfullstack.Controller;

import com.example.javaspringbootfullstack.Service.EmployeeService;
import com.example.javaspringbootfullstack.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SampleController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String Main(ModelMap modelMap) {
        List<Employee> em = employeeService.findAll();
        modelMap.addAttribute("listEmployee",em);
        return "index";
    }
}

