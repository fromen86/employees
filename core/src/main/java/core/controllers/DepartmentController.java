package core.controllers;

import core.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
  @Autowired
  private DepartmentService departmentService;

  @GetMapping("/list")
  @ResponseBody
  public String list(Model model) {
    model.addAttribute("departments", departmentService.getDepartments());
    return "department";
  }
}
