package com.pronoide.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/foo")
@CrossOrigin(origins = "https://solid-robot-q94p49695w72x5g7.github.dev/")
public class DemoController {

    @RequestMapping
    public record Foo(int id,String name){

    }

    @GetMapping

    public List<Foo> getFoo(){
        var res = new ArrayList<Foo>();
        res.add(new Foo(1, "Sergio"));
        res.add(new Foo(2, "Pedro"));
        return res;
    }
}
