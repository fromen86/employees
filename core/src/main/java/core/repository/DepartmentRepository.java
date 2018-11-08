package core.repository;

import core.entitties.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author makhramovich
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
