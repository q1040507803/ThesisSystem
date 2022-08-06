package com.LeaYrx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String sid;
    private String sname;
    private String cid;
    private String cname;
    private String tid;
    private String tname;
}
