package com.springboot.stumanage.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class choose {
	@Id
    @GeneratedValue

    private int id;
    private String password;
    private String username;
    private int tab;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFan_no(String fan_no) {
        this.password = fan_no;
    }

    @Override
    public String toString() {
        return "ExceptionOutput{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", tab=" + tab +
                '}';
    }

    public void setCall_time(String call_time) {
        this.username = call_time;
    }

    public void setCall_count(int call_count) {
        this.tab = call_count;
    }

    public String getFan_no() {
        return password;
    }

    public int getCall_count() {
        return tab;
    }



    public String getCall_time() {
        return username;
    }
}
