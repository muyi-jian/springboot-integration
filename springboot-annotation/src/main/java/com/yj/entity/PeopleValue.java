package com.yj.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class PeopleValue {
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;
    @Value("${person.boss}")
    private boolean boss;
    @Value("${person.birth}")
    private Date birth;
    private List<Object> lists;
    private Dog dog;
    private Map<String, Object> maps;
    public PeopleValue() {
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public PeopleValue(String lastName, int age, boolean boss, Date birth, List<Object> lists, Dog dog, Map<String, Object> maps) {
        this.lastName = lastName;
        this.age = age;
        this.boss = boss;
        this.birth = birth;
        this.lists = lists;
        this.dog = dog;
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "People{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", lists=" + lists +
                ", dog=" + dog +
                ", maps=" + maps +
                '}';
    }
}
