package com.movev.springbootdatajdbc.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(value = {"handler"})
@AllArgsConstructor
@Data
//@NoArgsConstructor
@Accessors(chain = true)
public class Department implements Serializable {
    private Integer id;
    private String departmentName;
    private List<Employee> employeeList;

//    public Department() {
//        super();
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//    public void setEmployeeList(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "id=" + id +
//                ", departmentName='" + departmentName + '\'' +
//                '}';
//    }
}
