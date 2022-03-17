package com.study.controller;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import com.study.utils.SFTPUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Program: MyJavaStudy
 * @ClassName: com.study.controller.MySftp
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-17 14:09
 * @Version: V1.0
 */
@Api(tags = "文件上传接口")
@RestController
@RequestMapping("/api")
public class MySftpController {

    @Autowired
    private Environment environment;

    @PostMapping("/FileUpload")
    @ApiOperation(value = "文件上传")
    public Map<String,Object> fileUpload(@RequestPart("file") MultipartFile file) {
        Map<String,Object> data = new HashMap<>();
        if (file.isEmpty()) {
            data.put("msg","fail");
            data.put("rst","0");
            return data;//"上传失败，请选择文件";
        }
        System.out.println(file);
        String nowTime = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS").format(new Date());
        String fileName = nowTime + "_" + file.getOriginalFilename();
        String username = environment.getProperty("sftp.username");
        String password = environment.getProperty("sftp.password");
        String host = environment.getProperty("sftp.host");
        Integer port = Integer.parseInt(environment.getProperty("sftp.port"));
        String path = environment.getProperty("sftp.path");
        try {
            SFTPUtil sftp = new SFTPUtil(username,password,host,port);
            sftp.login();
            InputStream is = file.getInputStream();
            // 多级目录创建并上传
            sftp.uploadMore(path+nowTime.substring(0,10), fileName, is);
            String url = "https://"+environment.getProperty("sftp.file-url")+nowTime.substring(0,10)+"/"+fileName;
            sftp.logout();
            data.put("name",fileName);
            data.put("status","done");
            data.put("url",url);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        data.put("msg","fail");
        data.put("rst","0");

        return data;
    }
}