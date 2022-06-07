package com.yj.controller;

import com.yj.entity.People;
import com.yj.entity.PeopleValue;
import com.yj.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private People People;
    @Autowired
    private PeopleValue personVal;

    @Autowired
    private Person person;
    @RequestMapping("/hello")
    public People hello() {
        return People;
    }
    @RequestMapping("/hello/val")
    public PeopleValue helloVl() {
        return personVal;
    }
    @RequestMapping("/hello/person")
    public Person helloPerson() {
        return person;
    }
}
