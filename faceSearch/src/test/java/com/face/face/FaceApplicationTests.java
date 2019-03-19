package com.face.face;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ListFactoryBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import net.sf.json.JSONObject;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FaceApplicationTests {
    @Autowired
    FaceRestController faceRestController;
    @Test
    public void contextLoads() {
    }

//    @Test
//    public void indexHeaderTest(){
//       User user = faceRestController.indexHeader("123");
//        System.out.println(user.getPicturePath());
//    }
//
//    @Test
//    public void dealVideoToPictureTest(){
//          DealVideoToPicture dealVideoToPicture = new DealVideoToPicture();
//            //视频文件路径
//            String videoPath = "E:/testffmpeg";
//            String videoFileName = "feidaou.mp4";
//        dealVideoToPicture.grabberVideoFramer(videoPath, videoFileName);
//    }

    @Test
    public void sendPostTest(){
        String authorizeUrl = "http://192.168.15.100:9529/user";
        String bodyJson ="{\"data\":[\"/opt/yangguan/yushan/mtcnn_facenet_flask/testimage/images/zongli.jpg\"]}";
        ResponseEntity<String> resultVo = faceRestController.sendPostRequest(authorizeUrl, bodyJson);
//        System.out.println(resultVo.getBody());
        User user = (User) JSONObject.toBean(JSONObject.fromObject(resultVo.getBody()),User.class);
        System.out.println();
        Face face = (Face) JSONObject.toBean(JSONObject.fromObject(user.getData().get(0)),Face.class);
        System.out.println(face.getFaceID());
        System.out.println(face.getFaceID().size());
        //        System.out.println(user.getData().get(0).getBbox());
//        System.out.println(user.getData().get(0).getBbox());
//        JSONObject jsonObject=JSONObject.fromObject();
////        System.out.println(jsonObject);
////        List<Face> listF =  (List)jsonObject.get("data");
//        JSONObject.toBean(resultVo.getBody().toString(),User.class);
//             (JSONObject)resultVo.getBody();
    }
}
