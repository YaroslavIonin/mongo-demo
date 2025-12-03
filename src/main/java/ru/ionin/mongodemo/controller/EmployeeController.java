package ru.ionin.mongodemo.controller;

import ru.ionin.mongodemo.model.Employee;
import ru.ionin.mongodemo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository repository;

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @GetMapping("/filter")
    public List<Employee> getByTypeAndAge(
            @RequestParam String type,
            @RequestParam int age
    ) {
        return repository.findByTypeAndAgeSorted(type, age);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
