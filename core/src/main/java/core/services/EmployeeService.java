package core.services;

import core.entitties.Employee;
import core.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author makhramovich
 */
@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  public Employee getEmployee(final Long id) {
    return employeeRepository.findById(id).orElse(null);
  }

  public void addEmployee(final Employee employee) {
    employeeRepository.save(employee);
  }
}
