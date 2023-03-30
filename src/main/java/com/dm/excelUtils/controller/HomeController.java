package com.dm.excelUtils.controller;

import com.gitee.freakchicken.DBApi;
import com.gitee.freakchicken.entity.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    @Autowired
    DBApi dbApi;

    @RequestMapping("/hello")
    public ResponseDto hello(@RequestBody Map<String,Object> map) {
        // 第一个参数是sql执行的所有参数，一定要封装成Map<String,Object>类型
        // 第二个参数是上一步sql.xml中sql脚本对应的id
        ResponseDto execute = dbApi.execute(map, "getUser");
        return execute;
    }

    @RequestMapping("/getUserIn")
    public ResponseDto getUserIn(@RequestBody Map<String,Object> map) {

        // 第一个参数是sql执行的所有参数，一定要封装成Map<String,Object>类型
        // 第二个参数是上一步sql.xml中sql脚本对应的id
        ResponseDto execute = dbApi.execute(map, "getUserIn");
        return execute;
    }

    @RequestMapping("/addUser")
    public ResponseDto addUser(@RequestBody Map<String, Object> map) {

        ResponseDto execute = dbApi.execute(map, "addUser");
        return execute;
    }
}
