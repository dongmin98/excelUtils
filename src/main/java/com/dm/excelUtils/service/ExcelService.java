package com.dm.excelUtils.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface ExcelService {
    Map<String, Object> getExcelContent(MultipartFile file);
}
