package com.dm.excelUtils.controller;

import com.alibaba.fastjson.JSON;
import com.dm.excelUtils.domain.Result;
import com.dm.excelUtils.exception.MyException;
import com.dm.excelUtils.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/excelUtils")
public class ExcelController {

    @Autowired
    private ExcelService excelService;
    /**
     * 上传文件
     * @param file
     * @return
     */
    @GetMapping("/uploadExcel")
    public Result uploadExcel(MultipartFile file) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map =  excelService.getExcelContent(file);
            return Result.sucess(map);
        } catch (MyException e) {
            System.out.println("ExcelController uploadExcel MyException : " + e);
            return Result.fail(e);
        } catch (Exception e) {
            System.out.println("ExcelController uploadExcel Exception : " + e);
            return Result.fail(map);
        }
    }

    @GetMapping("/getObjType")
    public Result getObjType(@RequestBody(required = false) Map<String,Object> condition ) {
        try {
            String names1 = condition.get("names").toString();
            System.out.println(names1);

            return Result.sucess(names1);
        } catch (Exception e) {
            return Result.fail(e);
        }
    }
}
