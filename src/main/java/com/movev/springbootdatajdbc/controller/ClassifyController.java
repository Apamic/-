package com.movev.springbootdatajdbc.controller;


import com.movev.springbootdatajdbc.bean.Classify;
import com.movev.springbootdatajdbc.mapper.ClassifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassifyController {
    @Autowired
    ClassifyMapper classifyMapper;

    @GetMapping("/getClassifyAll/{id}")
    public List<Classify> getClassifyAll(@PathVariable("id") int id) {
        return classifyMapper.getClassifyAll(id);
    }


    @GetMapping("/getById/{id}")
    public List<Classify> getById(@PathVariable("id") int id) {
        return classifyMapper.getById(id);
    }
}
