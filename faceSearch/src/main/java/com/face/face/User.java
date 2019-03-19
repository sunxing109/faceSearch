package com.face.face;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class User {
   private List<Face> data = new ArrayList<>();

    private int time = 0;

    public List<Face> getData() {
        return data;
    }

    public void setData(List<Face> data) {
        this.data = data;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
