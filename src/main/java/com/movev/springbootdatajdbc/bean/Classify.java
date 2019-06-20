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
public class Classify implements Serializable {
    private int id;
    private String name;
    private int parentId;
    private List<Classify> categoryList;

    public Classify() {
        super();
    }
}
