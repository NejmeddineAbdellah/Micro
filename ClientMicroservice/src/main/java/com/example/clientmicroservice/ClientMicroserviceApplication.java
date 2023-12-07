package com.example.clientmicroservice;

import com.example.clientmicroservice.entities.Client;
import com.example.clientmicroservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientMicroserviceApplication.class, args);

    }
    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Rabab FAHSSI", Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"), "Houda EL KORAINI", Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("3"), "Saad BAKANZIZE", Float.parseFloat("22")));

        };
    }


}
