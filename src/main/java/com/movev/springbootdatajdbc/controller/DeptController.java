package com.movev.springbootdatajdbc.controller;


import com.movev.springbootdatajdbc.bean.Department;
import com.movev.springbootdatajdbc.bean.Employee;
import com.movev.springbootdatajdbc.mapper.DepartmentMapper;
import com.movev.springbootdatajdbc.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/getEmpByIdStep/{id}")
    public Employee getEmpByIdStep(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpByIdStep(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/deleEmp/{id}")
    public void deleteEmp(@PathVariable("id") Integer id) {

    }

    @GetMapping("/getEmpIdAndName/{id}/{lastName}")
    public Employee getEmpByIdAndLastName(@PathVariable("id") Integer id,@PathVariable("lastName") String lastName) {
        return employeeMapper.getEmpByIdAndLastName(id,lastName);
    }

    @GetMapping("/getEmpsByLastNameLike/{lastName}")
    public List<Employee> getEmpsByLastNameLike(@PathVariable("lastName") String lastName) {

        return employeeMapper.getEmpsByLastNameLike(lastName);
    }

    @GetMapping("/getEmpByIdReturnMap/{id}")
    public Map<String,Object> getEmpByIdReturnMap(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpByIdReturnMap(id);
    }

    @GetMapping("/getEmpByLastNameLikeReturnMap/{lastName}")
    public Map<String,Employee> getEmpByLastNameLikeReturnMap(@PathVariable("lastName") String lastName) {
        return employeeMapper.getEmpByLastNameLikeReturnMap(lastName);
    }

    @GetMapping("/getEmpAndDept/{id}")
    public Employee getEmpAndDept(@PathVariable("id") Integer id){
        return employeeMapper.getEmpAndDept(id);
    }


    @GetMapping("/getDeptByIdPlus/{id}")
    public Department getDeptByIdPlus(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptByIdPlus(id);
    }

    @GetMapping("/getDeptByIdStep/{id}")
    public Department getDeptByIdStep(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptByIdStep(id);
    }

    @GetMapping("/getEmpsByDeptId/{id}")
    public List<Employee> getEmpsByDeptId(@PathVariable("id") Integer id){
//        return employeeMapper.getEmpsByDeptId(id);
        return employeeMapper.getEmpsByDeptId(id);
    }

//    @GetMapping("/insertEmp/{employee}")
//    public Employee insertEmp(@PathVariable("employee") Employee employee) {
//        return employeeMapper.getEmpById()
//    }

    @GetMapping("/getEmpsByConditionIf")
    public List<Employee> getEmpsByConditionIf() {
        Employee employee = new Employee(null,"%e%",null,"wwwsdf",null);

        return employeeMapper.getEmpsByConditionIf(employee);
    }

    @GetMapping("/getEmpsByConditionTrim")
    public List<Employee> getEmpsByConditionTrim() {
        Employee employee = new Employee(null,"%e%",null,null,null);
        return employeeMapper.getEmpsByConditionTrim(employee);
    }


    @GetMapping("/getEmpsByConditionChoose")
    public List<Employee> getEmpsByConditionChoose() {
        Employee employee = new Employee(null,null,null,null,null);
        return employeeMapper.getEmpsByConditionChoose(employee);
    }


    @GetMapping("/updateEmps")
    public void updateEmps() {
        Employee employee = new Employee(1,"王磊",null,null,null);
        employeeMapper.updateEmps(employee);
    }

    @GetMapping("/updateEmp")
    public void updateEmp() {
        Employee employee = new Employee(2,"张杨",null,null,null);
        employeeMapper.updateEmp(employee);
    }


    @GetMapping("/getEmpsByConditionForeach")
    public List<Employee> getEmpsByConditionForeach() {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
        return employeeMapper.getEmpsByConditionForeach(Arrays.asList(8,9,10,56));
    }

//    @GetMapping("/addEmps")
//    public void addEmps() {
//        List<Employee> list = new ArrayList<>();
//        list.add(new Employee(null,"132",0,"wwwsdf",4));
//        list.add(new Employee(null,"456",0,"wwwsdf",4));
//        employeeMapper.addEmps(list);
//    }

    @GetMapping("/getEmpsTestInnerParameter")
    public List<Employee> getEmpsTestInnerParameter() {
        return employeeMapper.getEmpsTestInnerParameter(new Employee());
    }
}
