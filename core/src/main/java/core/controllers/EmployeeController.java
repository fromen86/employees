package core.controllers;

import core.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "employees")
public class EmployeeController {
  @Autowired
   private EmployeeService employeeService;

  @GetMapping("/list")
  public void list(@RequestParam(required = false) Long departmentId, @RequestParam Model model) {
    model.addAttribute("employees", employeeService.getEmployees());
  }
}