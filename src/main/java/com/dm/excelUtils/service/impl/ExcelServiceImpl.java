package com.dm.excelUtils.service.impl;

import com.dm.excelUtils.service.ExcelService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class ExcelServiceImpl implements ExcelService {

    /**
     * 读取excel文件
     * @param file
     * @return
     */
    public Map<String, Object> getExcelContent(MultipartFile file) {

        return null;
    }
}
