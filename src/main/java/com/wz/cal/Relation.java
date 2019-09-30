package com.wz.cal;

import lombok.Data;

@Data
public class Relation {
    private Integer id;
    private String id1;
    private String id2;//id2=0 mean type!=0
    private String type;//type=0 onetoone's relation
    private Double value;
    private Integer star;
}
