package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swaggerconfig {
	@Bean
	  public Docket api() {
	      return new Docket(DocumentationType.SWAGGER_2)
	              .select()
	              .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
	              .paths(PathSelectors.any())
	              .build().apiInfo(metaData());
	  }

	  private ApiInfo metaData() {
	      return  new ApiInfoBuilder()
	              .title("Spring boot Swagger Configuration")
	              .description("lob API reference for developers")
	              .version("1.1.0")
	              .license("Apache License Version 2.0")
	              .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
	              .contact(new Contact("LOB","https://www.google.com/UCMpJ8m1w9t7","javadeveloper.ja@gmail.com"))
	              .build();
	  }
	  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	      registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

	      registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	  }

}
