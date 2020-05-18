package com.wmy.Creature;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/18
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private String id;
    private String  name;
    private int  age;
    private String  sex;

    public Person(){}
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }

    public void seId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void person(String id,String name,String age,String sex) {
        System.out.println("乘客id："+id);
        System.out.println("乘客姓名："+name);
        System.out.println("乘客年龄:"+age);
        System.out.println("性别："+sex);
        System.out.println("--------------------------");
    }
}
