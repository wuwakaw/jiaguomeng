package com.wz.cal;

import lombok.Data;

@Data
public class House {
    private Integer id;
    private Integer type;//1 zhuzhai;2 shangye;3 gongye
    private Integer star;
    private Double value;
    private String name;
}
