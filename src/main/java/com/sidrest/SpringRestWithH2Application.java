package com.sidrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringRestWithH2Application {
	
	@PostMapping("purchase/{username}/{amount}/{productname}")
   public String purchase(@PathVariable String username,@PathVariable double amount,@PathVariable String productname) {
		return "hi "+username+"your total is "+amount+" product name is "+productname+"";
	}
   
	public static void main(String[] args) {
		SpringApplication.run(SpringRestWithH2Application.class, args);
	}
	
	

}
