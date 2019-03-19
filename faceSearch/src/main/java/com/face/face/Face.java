package com.face.face;


import java.util.ArrayList;
import java.util.List;

public class Face {

    private List<Double> faceID = new ArrayList<>();

    private  Bbox bbox;

    public List<Double> getFaceID() {
        return faceID;
    }

    public void setFaceID(List<Double> faceID) {
        this.faceID = faceID;
    }

    public Bbox getBbox() {
        return bbox;
    }

    public void setBbox(Bbox bbox) {
        this.bbox = bbox;
    }
}
