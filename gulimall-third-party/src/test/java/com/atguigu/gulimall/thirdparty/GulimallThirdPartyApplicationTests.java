package com.atguigu.gulimall.thirdparty;
import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpload () throws FileNotFoundException {
        if (ossClient == null){
            System.out.println("空指针----------------");
        }
        InputStream inputStream = new FileInputStream("/Users/wangbin/Desktop/pics/8bf441260bffa42f.jpg");
        ossClient.putObject("gulimall-room", "8bf441260bffa42f.jpg", inputStream);
       // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传完成");
    }
    @Test
    public void contextLoads() {

    }

}
