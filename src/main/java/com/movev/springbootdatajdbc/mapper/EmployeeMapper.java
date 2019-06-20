package com.movev.springbootdatajdbc.mapper;


import com.movev.springbootdatajdbc.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//@Mapper或@MapperScan将接口扫描到装配到容器中
public interface EmployeeMapper {

    public List<Employee> getEmpsTestInnerParameter(Employee employee);

    public Employee getEmpAndDept(Integer id);

    public Employee getEmpByIdStep(Integer id);

    public List<Employee> getEmpsByDeptId(Integer deptId);

    @MapKey("lastName")
    public Map<String,Employee> getEmpByLastNameLikeReturnMap(String lastName);

    public Map<String,Object> getEmpByIdReturnMap(Integer id);

    public List<Employee> getEmpsByLastNameLike(String lastName);

    public Employee getEmpByIdAndLastName(@Param("id") Integer id,@Param("lastName") String lastName);

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmpById(Integer id);


    //携带了那个字段查询查询条件就带那个字段的值
    public List<Employee> getEmpsByConditionIf(Employee employee);

    public List<Employee> getEmpsByConditionTrim(Employee employee);

    public List<Employee> getEmpsByConditionChoose(Employee employee);

    public void updateEmps(Employee employee);

//    查询员工ID在给定集合中
    public List<Employee> getEmpsByConditionForeach(@Param("ids") List<Integer> list);

    
    public void addEmps(@Param("emps") List<Employee> emps);
}
