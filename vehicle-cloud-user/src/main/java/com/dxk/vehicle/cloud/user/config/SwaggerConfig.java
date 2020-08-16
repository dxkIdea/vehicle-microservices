package com.dxk.vehicle.cloud.user.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName : SwaggerConfig
 * @Description : Swagger2配置类
 * @Author : DingXK
 * @Date: 2020-08-15 20:19
 * knife4j是springfox-swagger的增强UI实现，为Java开发者在使用Swagger的时候，提供了简洁、强大的接口文档体验。
 * knife4j完全遵循了springfox-swagger中的使用方式，并在此基础上做了增强功能
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                //调用apiInfo方法
                .apiInfo(apiInfo())
                //配置访问路径
                .pathMapping("/")
                .select()
                //api接口包扫描路径
                .apis(RequestHandlerSelectors.basePackage("com.dxk.vehicle.cloud.user.controller"))
                //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .paths(PathSelectors.regex("/.*"))
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //设置文档的标题
                .title("客户微服务整合Swagger")
                //设置文档的描述
                .description("")
                //设置文档的联系方式
                .contact(new Contact("车辆管理微服务实战","https://github.com/dxkIdea/vehicle-microservices", "17600299358@163.com"))
                //设置文档的版本信息
                .version("1.0.0")
                //设置文档的License信息
                .license("")
                //.licenseUrl("http://www.baidu.com")
                .build();
    }
}
