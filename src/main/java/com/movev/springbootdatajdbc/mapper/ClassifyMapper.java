package com.movev.springbootdatajdbc.mapper;

import com.movev.springbootdatajdbc.bean.Classify;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface ClassifyMapper {
    public List<Classify> getClassifyAll(@Param("id")int id);

    public List<Classify> getById(@Param("id") int id);

}
