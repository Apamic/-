package com.movev.springbootdatajdbc.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

//注解 别名
@Alias("emp")

//作用是json序列化时忽略bean中的一些属性序列化和反序列化时抛出的异常，标不需要转化为josn的属性
@JsonIgnoreProperties(value = {"handler"})
@AllArgsConstructor
@Data
//@NoArgsConstructor
@Accessors(chain = true)
public class Employee implements Serializable {

    /**
     * implements Serializable 序列化接口
     */

    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;
    private Department department;

    public Employee() {
        super();
    }

    public Employee(Integer id, String lastName, Integer gender, String email, Integer dId) {
        this.id = id;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

//    public Employee(Integer id, String lastName, Integer gender, String email, Integer dId,Department department) {
//        this.id = id;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.email = email;
//        this.dId = dId;
//        this.department = department;
//    }

//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", lastName='" + lastName + '\'' +
//                ", gender=" + gender +
//                ", email='" + email + '\'' +
//                ", dId=" + dId +
//                '}';
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public Integer getGender() {
//        return gender;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Integer getdId() {
//        return dId;
//    }
//
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setGender(Integer gender) {
//        this.gender = gender;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setdId(Integer dId) {
//        this.dId = dId;
//    }
}
