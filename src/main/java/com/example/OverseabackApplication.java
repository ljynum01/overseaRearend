package com.example;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.oas.annotations.EnableOpenApi;
import sun.rmi.rmic.Generator;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class })
@EnableOpenApi
public class OverseabackApplication {

    public static void main(String[] args) {
        SpringApplication.run(OverseabackApplication.class, args);
    }


//    public static void main(String[] args) throws Exception {
//        //MBG 执行过程中的警告信息
//        List<String> warnings = new ArrayList<String>();
//        //当生成的代码重复时，覆盖原代码
//        boolean overwrite = true;
//        //读取我们的 MBG 配置文件
//        InputStream is = Generator.class.getResourceAsStream("/mybatis-generator-config.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(is);
//        is.close();
//
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        //创建 MBG
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        //执行生成代码
//        myBatisGenerator.generate(null);
//        //输出警告信息
//        for (String warning : warnings) {
//            System.out.println(warning);
//        }
//    }
}
