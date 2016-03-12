package com.proctor.backendservice.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by ashekar on 12/16/2015.
 */
@Configuration
public class SwaggerConfig {

    private String title= "Student service";
    private String description="This service is to access the Student Service data";
    private String termsOfServiceUrl = "";
    private String contact ="Arvind Shekar, Abihit,Ajit and Desmond";
    private String version="1.0";
    private String license ="Android class";
    private String licenseUrl = "";
    @Bean
    public Docket customImplementation() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl);

        return apiInfo;
    }

    private Predicate<String> paths(){
        return Predicates.and(Predicates.not(PathSelectors.regex("/error")), Predicates.not(PathSelectors.regex("/")));
    }
}
