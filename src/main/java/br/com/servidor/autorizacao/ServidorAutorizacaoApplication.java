package br.com.servidor.autorizacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class ServidorAutorizacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorAutorizacaoApplication.class, args);
	}
}
