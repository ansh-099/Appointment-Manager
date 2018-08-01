package com.drkanwardeepd.ansh0.drkanwardeep;

public class OneApp {
    String time;
    String name;
    String no;
    String age;
    OneApp(){

    }

    public OneApp(String time, String name, String no, String age) {
        this.time = time;
        this.name = name;
        this.no = no;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public String getTime() {
        return time;
    }
}
