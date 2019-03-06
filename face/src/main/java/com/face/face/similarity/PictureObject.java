package com.face.face.similarity;

import java.util.Arrays;

public class PictureObject {

    private String pictureId ;

    private String timestamp ;

    private String[] faceFeature;

    private double distance;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String[] getFaceFeature() {
        return faceFeature;
    }

    public void setFaceFeature(String[] faceFeature) {
        this.faceFeature = faceFeature;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "PictureObject [pictureId=" + pictureId + ", timestamp=" + timestamp + ", faceFeature="
                + Arrays.toString(faceFeature) + ", distance=" + distance + "]";
    }

}
