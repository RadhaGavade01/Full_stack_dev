package Controller;

import Entity.EmployeeEntity;
import Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmp()
    {
        return service.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    public Optional<EmployeeEntity> getEmpById(@PathVariable int id)
    {
        return service.getEmpById(id);
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody EmployeeEntity emp)
    {
        service.saveEmployee(emp);
        return "Employee created with id :: " +emp;
    }
}