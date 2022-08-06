package com.LeaYrx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Thesis {
    private int thid;
    private String thname;
    private Student student;
    private Teacher teacher;
    private College college;
}
