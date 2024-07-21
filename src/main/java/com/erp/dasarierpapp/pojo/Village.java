package com.erp.dasarierpapp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Village {

    private int village_id;
    private String village_name;
    private String village_address;
    private String village_city;
    private String village_zip;
    private List<People> people;
}
