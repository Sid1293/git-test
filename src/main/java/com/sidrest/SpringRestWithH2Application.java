package com.sidrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringRestWithH2Application {
	
	@PostMapping("purchase")
   public String purchase(@RequestBody Order order) {
		return "hi "+order.getUsername()+"your total is "+order.getAmount()+" product name is "+order.getUsername()+"";
	}
   
	public static void main(String[] args) {
		SpringApplication.run(SpringRestWithH2Application.class, args);
	}
	
	

}
