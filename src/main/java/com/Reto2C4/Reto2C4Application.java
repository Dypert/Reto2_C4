package com.Reto2C4;

import com.Reto2C4.InterfaceCRUD.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import com.Reto2C4.InterfaceCRUD.ProductInterface;

@Component
@SpringBootApplication
public class Reto2C4Application implements CommandLineRunner{

    @Autowired
    public UserInterface userCrudRepository;
            //UserRepository;
    
    @Autowired
    public ProductInterface prodcuctCrudRepository;
            //LaptopRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(Reto2C4Application.class, args);
	}
        
    @Override
    public void run(String... args) throws Exception {
        userCrudRepository.deleteAll();
        prodcuctCrudRepository.deleteAll();
    }
}
