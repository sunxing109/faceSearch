package com.face.face;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "rest")
public class faceController {

    @RequestMapping(value = "/indexHeader",method = RequestMethod.GET, produces = "application/json")
    public User indexHeader(@RequestHeader String picturePath) {
        System.out.println(picturePath);
       User user = new User();
       user.setName("xiaoxi");
       user.setSex("man");
       user.setFaceFeature(12.3);
       user.setPicturePath(picturePath);
        return user;
    }

    @RequestMapping(value = "/indexPathParam",method = RequestMethod.GET, produces = "application/json")
    public User indexPath(@PathParam("path") String path) {
        System.out.println(path);
        User user = new User();
        user.setPicturePath(path);
        user.setName("xiaoxi");
        return user;
    }

    @RequestMapping(value = "/indexPathVariable/{pathVariable}", method = RequestMethod.GET, produces = "application/json")
    public User indexPath2(@PathVariable String pathVariable){
        System.out.println(pathVariable);
        User user = new User();
        user.setPicturePath(pathVariable);
        user.setName("xiaoxi");
        return user;
    }
}
