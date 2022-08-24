package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
  1.如何使用Nacos作为配置中心同意管理
  2.引用依赖
    <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>

  3.创建一个bootstrap.properties,给这个配置文件配置上
     spring.application.name=gulimall-coupon
     spring.cloud.nacos.config.server-addr=127.0.0.1:8848
  4.需要给配置中心默认添加一个叫数据集（data ID）gulimall-coupon.properties.默认规则，应用名.properties
  5.给应用名.properties 添加配置
  6.动态获取配置
    @RefreshScope:动态获取并刷新配置
    @Value("{配置项的名}")：获取到配置
    如果配置中心和当前应用配置文件中都配置了相同的项，那么优先使用配置中心的配置。

  2.细节
   1).命名空间：配置隔离
     默认：public(保留空间)；默认新增的所有配置都在public空间内。
     1.开发测试生产：利用命名空间来做环境隔离
     需要注意的是需要在bootstrap.properties;配置上，需要使用那个命名空间下的配置
     spring.cloud.nacos.config.namespace=XXXXX
     2.每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置



   2).配置集:所有配置的集合
   3).配置集ID:类似配置文件名
      Data ID:类似文件名
   4).配置分组：
      默认所有的配置集都属于：DEFAULT_GROUP;
      1111，618，1212

  每个微服务创建自己的命名空间，使用配置分组区分环境dev test prod
 3，同时加载多个配置集
   1). 微服务任何配置信息，任何配置文件都可以放在配置中心
   2). 只需要在bootstrap.properties 说明加载配置中心那些配置文件即可
   3). @Value,@ConfiguretionProperties
      以前Springboot 任何方法从配置中心取值，都能使用
      配置中心有的优先使用配置中心的


 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
