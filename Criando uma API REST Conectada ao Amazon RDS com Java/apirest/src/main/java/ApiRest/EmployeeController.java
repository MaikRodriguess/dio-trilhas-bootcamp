package ApiRest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeRepository repository;


    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    public List<Employee> lisOfEmployeeAll(){
        return repository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee consulyById(@PathVariable long id){
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees")
    public Employee newEmployee(@RequestBody Employee newEmployee){
        return repository.save(newEmployee);
    }

    @PutMapping("employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, long id){
        return repository.findById(id).map(employee -> {
            employee.setName(newEmployee.getName());
            employee.setAddress(newEmployee.getAddress());
            employee.setRole(newEmployee.getRole());
            return repository.save(newEmployee);
        }).orElseGet(() -> {
            newEmployee.setId(id);
            return repository.save(newEmployee );
        });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable long id ){
        repository.deleteById(id);
    }
}
