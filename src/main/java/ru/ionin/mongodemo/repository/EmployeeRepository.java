package ru.ionin.mongodemo.repository;

import ru.ionin.mongodemo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    List<Employee> findByName(String name);

    List<Employee> findByAgeGreaterThan(int age);

    @Query(value = "{ 'type': ?0, 'age': { $gt: ?1 } }", sort = "{ 'age': 1 }")
    List<Employee> findByTypeAndAgeSorted(String type, int age);
}
