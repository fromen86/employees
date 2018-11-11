package core.services;

import core.entitties.Department;
import core.repository.DepartmentRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

  public List<Department> getDepartments() {
    return IteratorUtils.toList(departmentRepository.findAll().iterator());
  }
}
