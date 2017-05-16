package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@EnableSwagger2
public class Application {

       public static void main(String[] args) {
              SpringApplication.run(Application.class, args);
       }
       
       @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.example"))              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
     
    private ApiInfo apiInfo() {
         return new ApiInfoBuilder().title("AMC API")
         .description("AMC API reference for demo")
         .version("1.0").build();
    }
    
    /*@Configuration
	protected static class JPAConfiguration{
		

		@Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
			LocalContainerEntityManagerFactoryBean entityManagerFactory=new LocalContainerEntityManagerFactoryBean();
			return entityManagerFactory;
		}
    }*/
}

