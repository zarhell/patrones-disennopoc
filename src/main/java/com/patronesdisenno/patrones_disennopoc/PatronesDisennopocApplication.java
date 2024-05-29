package com.patronesdisenno.patrones_disennopoc;

import com.patronesdisenno.patrones_disennopoc.application.ports.out.NotificationService;
import com.patronesdisenno.patrones_disennopoc.domain.services.NotificationServiceImpl;
import com.patronesdisenno.patrones_disennopoc.infrastructure.persistence.EquipmentRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.patronesdisenno.patrones_disennopoc.application.ports.out.EquipmentRepository;
@SpringBootApplication
public class PatronesDisennopocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDisennopocApplication.class, args);
	}

	@Bean
	public EquipmentRepository equipmentRepository() {
		return new EquipmentRepositoryImpl();
	}

	@Bean
	public NotificationService notificationService() {
		return new NotificationServiceImpl();
	}
}