package core.services;

import core.entitties.Department;
import core.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author makhramovich
 */
@Service
public class DepartmentService {
  @Autowired
  private DepartmentRepository departmentRepository;

  public void saveDepartment(Department department) {
    departmentRepository.save(department);
  }
}
