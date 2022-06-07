package com.yj.service.impl;

import com.yj.entity.Person;
import com.yj.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {
    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }
}
