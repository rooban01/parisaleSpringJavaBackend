package com.parisSales;

import com.parisSales.dao.UserRepository;
import com.parisSales.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ParisSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParisSalesApplication.class, args);
	}




}
