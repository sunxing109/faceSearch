package com.face.face.similarity;

import java.util.ArrayList;
import java.util.List;

public class ODistance {
    public static void main(String[] args) {
        List<PictureObject> pictureObjList = new ArrayList<PictureObject>();

        for(int i=0; i<6000; i++) {
            PictureObject pictureObj = new PictureObject();
            pictureObj.setPictureId("id" + i);
            pictureObj.setFaceFeature(arrayf2());
            pictureObj.setTimestamp(String.valueOf(i));
            pictureObjList.add(pictureObj);
        }
        List<PictureObject> picMatch = new ArrayList<PictureObject>();
        double compareValue = 0.8;
        for(int i=0;i<pictureObjList.size();i++) {
            String[] Arrayf2 =pictureObjList.get(i).getFaceFeature();
            double distance = calculateDistance(arrayf1() ,Arrayf2);
            if(distance <= compareValue) {
                pictureObjList.get(i).setDistance(distance);
                picMatch.add(pictureObjList.get(i));
            }
        }

        System.out.println(picMatch.size());
    }
        public static String[] arrayf1() {
            StringBuffer iff = new StringBuffer();
            for(int i=1;i<=128; i++) {
                iff.append(",");
                iff.append(i);
            }
            String[] f1 = iff.toString().substring(1).split(",");
            return f1;
        }

        public static String[] arrayf2() {
            StringBuffer iff = new StringBuffer();
            for(int i=1;i<=128; i++) {
                iff.append(",");
                iff.append(i+Math.random()/8);
//			iff.append(i+0.1);
            }
            String[] f1 = iff.toString().substring(1).split(",");
            return f1;
        }

        public static double calculateDistance(String[] arrayf1, String[] arrayf2) {
            double sum = 0.0;
            for(int i=0;i<arrayf1.length; i++) {
                sum += Math.pow(Double.parseDouble(arrayf1[i]) - Double.parseDouble(arrayf2[i]), 2);
            }
            return Math.sqrt(sum);
        }



}
