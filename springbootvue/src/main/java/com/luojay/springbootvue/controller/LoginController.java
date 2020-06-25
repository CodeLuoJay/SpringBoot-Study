package com.luojay.springbootvue.controller;

import com.luojay.springbootvue.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class LoginController {
    @CrossOrigin
    @PostMapping(value = "/vue-admin-template/user/login")
    @ResponseBody
    public Map login(@RequestBody User user) {
        String username = user.getUsername();

        HashMap<String, Object> tokens = new HashMap<>();

        tokens.put("admin","admin-token");
        tokens.put("editor","editor-token");

        HashMap<String, Object> response = new HashMap<>();
        HashMap<String, Object> responseData = new HashMap<>();
        responseData.put("token",tokens.get(username));
        response.put("code",20000);
        response.put("msg","登录成功");
        response.put("data",responseData);
        return response;
    }

    @CrossOrigin
    @GetMapping(value = "/vue-admin-template/user/info")
    @ResponseBody
    public Map info(@RequestParam("token")String token) {

        HashMap<String, Object> users = new HashMap<>();

        User adminUser = new User();
        User editorUser = new User();

       
        List<String> adminRole = new ArrayList<String>();
        adminRole.add("admin-token");  
        List<String> editorRole = new ArrayList<String>();
        adminRole.add("editor-token");

        adminUser.setRoles(adminRole);
        adminUser.setIntroduction("I am a super administrator");
        adminUser.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        adminUser.setName("Super Admin");
        
        editorUser.setRoles(editorRole);
        editorUser.setIntroduction("I am an editor");
        editorUser.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        editorUser.setName("Normal Editor");

        users.put("admin-token",adminUser);
        users.put("editor-token",editorUser);

        HashMap<String, Object> responseData = new HashMap<>();
        responseData.put("code",20000);
        responseData.put("msg","登录成功");
        responseData.put("data",users.get(token));

        return responseData;


    }
    @CrossOrigin
    @PostMapping(value = "/vue-admin-template/user/logout")
    @ResponseBody
    public Map logout() {
        HashMap<String, Object> responseData = new HashMap<>();
        responseData.put("code",20000);
        responseData.put("msg","退出成功");
        responseData.put("data","success");
        return responseData;
    }
}
