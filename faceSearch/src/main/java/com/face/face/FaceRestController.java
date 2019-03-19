package com.face.face;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "rest")
public class FaceRestController {

//    @RequestMapping(value = "/indexHeader",method = RequestMethod.GET, produces = "application/json")
//    public User indexHeader(@RequestHeader String picturePath) {
//        System.out.println(picturePath);
//       User user = new User();
//       user.setName("xiaoxi");
//       user.setSex("man");
//       user.setFaceFeature(12.3);
//       user.setPicturePath(picturePath);
//        return user;
//    }
//
//    @RequestMapping(value = "/indexPathParam",method = RequestMethod.GET, produces = "application/json")
//    public User indexPath(@PathParam("path") String path) {
//        System.out.println(path);
//        User user = new User();
//        user.setPicturePath(path);
//        user.setName("xiaoxi");
//        return user;
//    }
//
//    @RequestMapping(value = "/indexPathVariable/{pathVariable}", method = RequestMethod.GET, produces = "application/json")
//    public User indexPath2(@PathVariable String pathVariable){
//        System.out.println(pathVariable);
//        User user = new User();
//        user.setPicturePath(pathVariable);
//        user.setName("xiaoxi");
//        return user;
//    }



    /**
     * 向目的URL发送post请求
     * @param url       目的url
     * @param  data   发送的参数
     * @return  ResultVO
     */
    @RequestMapping(value = "/sendPost", method = RequestMethod.POST, produces = "application/json")
    public static ResponseEntity<String> sendPostRequest(String url, @RequestBody String data){
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        HttpMethod method = HttpMethod.POST;
        // 以表单的方式提交
        //headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //将请求头部和参数合成一个请求
        HttpEntity<String> requestEntity = new HttpEntity<>(data, headers);
        //执行HTTP请求，将返回的结构使用ResultVO类格式化
        ResponseEntity<String> user = client.exchange(url, method, requestEntity,String.class);

        return user;
    }

}
