package com.wz.cal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("jwm")
public class DataCal {

    @PostMapping
    public String best(@RequestBody Map map){
        return "sss";
    }
}
