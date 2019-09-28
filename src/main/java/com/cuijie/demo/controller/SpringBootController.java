package com.cuijie.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

@RestController
public class SpringBootController {

    @GetMapping("hello")
    public Object hello(){

        HashMap<Object, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("name","崔杰");
        return map;






    }



}
