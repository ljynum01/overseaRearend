package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@Api(tags = "上传图片接口")
public class UploadController {

    @ApiOperation("上传图片")
    @PostMapping("/upload")
    public List<String> upload(MultipartFile[] fileUpload) {
        List<String> imageList = new ArrayList<>();
        for(MultipartFile file : fileUpload) {
            String fileName = file.getOriginalFilename();
            fileName = UUID.randomUUID() + "_" + fileName;
//            @/assets/9e0d5cef-3bf0-4f4b-9dfa-351ac91640d6_人.png
//            String dirPath = "D:\\Projects\\ideaProjects\\springBootTraining\\vuetestui\\src\\assets\\";
            String dirPath = "/Users/luo/Desktop/oversea-mall/oversea-front/src/assets/";
            String vuePath = " @/assets/";
            try {
                file.transferTo(new File(dirPath + fileName));
                imageList.add(fileName);
            }catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return imageList;
    }
}
