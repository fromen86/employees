package core.repository;

import core.entitties.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author makhramovich
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
