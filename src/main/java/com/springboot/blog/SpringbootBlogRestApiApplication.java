package com.springboot.blog;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringbootBlogRestApiApplication {

        @RequestMapping("/")
        public String Index()
        {
            return "working!";
        }
        
	@Bean
	public ModelMapper modelMapper(){
            return new ModelMapper();
	}
	public static void main(String[] args) {
            SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}
}
//https://github.com/DamilolaAdegunwa/rameshmf-springboot-blog-rest-api