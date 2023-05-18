package com.web.education.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

public class Cqb {
    private int id;
    private String username;
    private double hitrate;
    private int time;
    @TableField(fill = FieldFill.INSERT)
    private String date;

    public Cqb(int id, String username, double hitrate, int time, String date) {
        this.id = id;
        this.username = username;
        this.hitrate = hitrate;
        this.time = time;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getHitrate() {
        return hitrate;
    }

    public void setHitrate(double hitrate) {
        this.hitrate = hitrate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
