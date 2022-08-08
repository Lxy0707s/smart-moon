package com.unio.smartmoon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Knife4jConfiguration {

    @Value("${swagger.enable}")
    private Boolean enable;


    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        String groupName="2.0版本";
        Docket docket=new Docket(DocumentationType.OAS_30)
                .enable(enable)
                .apiInfo(
                        new ApiInfoBuilder()
                                //.title("swagger-bootstrap-ui RESTful APIs")
                                .description("# swagger-bootstrap-ui restful APIs")
                                .termsOfServiceUrl("https://www.xx.com/")
                                .contact(new Contact("管理员", "https://www.xx.com/", "xxxx@qq.com"))
                                .version("2.0")
                                .build()
                )
                //分组名称
                .groupName(groupName)
                .select()
                //这里指定你自己的Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.unio.smartmoon.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
