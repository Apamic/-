package com.movev.springbootdatajdbc.mapper;


import com.movev.springbootdatajdbc.bean.Department;
import org.apache.ibatis.annotations.*;


//指定这是一个操作数据库的mapper
//@Mapper  主程询中加 MapperScen
public interface DepartmentMapper {

//    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    public Department getDeptByIdPlus(Integer id);

    public Department getDeptByIdStep(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);


    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);


}
