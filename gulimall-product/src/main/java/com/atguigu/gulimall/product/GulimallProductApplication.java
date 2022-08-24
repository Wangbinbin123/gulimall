package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
   1.整合MyBatis-Plus
     1）导入依赖

     2）配置
       1.配置数据源：
          导入数据源驱动
          在application.yml 配置数据源相关信息
      2. 配置Mybatis-Plus
         使用@MapperScan
         告诉Mybatis-Plus,sql硬射文件位置

   2,逻辑删除
     1）配置全局的逻辑删除规则
     2）配置逻辑删除组件Bean（高版本不用配置）
     3）加上逻辑删除注解
   3,JSR303
     1给bean添加校验注解：javax.validation.constraints，并自定义自己的message提示
     2开启校验功能@Valid
      效果：校验错误会有默认的响应
     3给校验的bean后紧跟一个BingResult,就可以获取到校验的结果
     4分组校验（多场景的负责校验）
       	@NotBlank(message = "品牌名必须提交",groups = {AddGroup.class,UpdateGroup.class})
          给校验注解标注什么情况需要校验
        @Validated({UpdateGroup.class})
        默认没有制定分组的校验注解在分组情况下不生效，在不分组情况下生效
    5自定义校验
      1.编写一个自定义的校验注解
      2.编写一个自定义的校验器ConstraintValidator
      3.关联自定义的校验器和自定义的校验注解
        @Documented
        @Constraint(
           validatedBy = {ListValueConstraintValidator.class「可以制定多个不同的校验器，适配不同类型的校验」}
         )
        @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
        @Retention(RetentionPolicy.RUNTIME)


   4，统一的异常处理
      @ControllerAdvice
      1编写异常处理类，使用@ControllerAdvice
      2使用@ExceptionHandler标注方法可以处理的异常







 */

@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
