package com.hoteis.hoteis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hoteis.hoteis.models.Hotel;
import com.hoteis.hoteis.repository.HotelRepository;

@SpringBootApplication
public class HoteisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoteisApplication.class, args);
	}

	@Bean
	public CommandLineRunner inicializator(@Autowired HotelRepository hotelRepository){
		return argument -> {
			Hotel hotel1 = new Hotel();
			hotel1.setName("Little Hotel");
			hotel1.setCity("Sorocaba");
			hotel1.setState("São Paulo");
			hotel1.setDiary(140.0);
			hotel1.setStars(3.7);

			hotelRepository.save(hotel1);

			Hotel hotel2 = new Hotel();
			hotel2.setName("Caracavana");
			hotel2.setCity("Rio de Janeiro");
			hotel2.setState("Rio de Janeiro");
			hotel2.setDiary(90.0);
			hotel2.setStars(4.4);

			hotelRepository.save(hotel2);

			Hotel hotel3 = new Hotel();
			hotel3.setName("Fazendinha");
			hotel3.setCity("Belo Horizonte");
			hotel3.setState("Minas Gerais");
			hotel3.setDiary(170.0);
			hotel3.setStars(4.8);

			hotelRepository.save(hotel3);

		};
	}
}
