package com.maryanto.dimas.webapp.example.controller;

import com.maryanto.dimas.webapp.example.entity.Employee;
import com.maryanto.dimas.webapp.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/byId/{employeeId}")
    public ModelAndView findByIdView(@PathVariable(value = "employeeId") Integer employeeId, ModelAndView view) {
        view.setViewName("/halo");
        view.addObject("message", "Halo from Controller");
        view.addObject("employee", employeeService.findById(employeeId));
        return view;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/byId/{employeeId}/json",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public Employee findByIdJson(@PathVariable(value = "employeeId") Integer employeeId) {
        return this.employeeService.findById(employeeId);
    }

}
