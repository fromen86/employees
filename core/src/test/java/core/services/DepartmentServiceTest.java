package core.services;

import core.CoreApplication;
import core.entitties.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_CLASS;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author makhramovich
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CoreApplication.class)
@DirtiesContext(classMode = AFTER_CLASS)
public class DepartmentServiceTest {
  @Autowired
  private DepartmentService departmentService;

  @Test
  public void testSaveDepartment() {
    Department department = new Department();
    department.setName("Department1");
    departmentService.saveDepartment(department);
  }
}
