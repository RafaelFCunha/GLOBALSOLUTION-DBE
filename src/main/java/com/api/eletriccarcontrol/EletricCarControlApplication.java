package com.api.eletriccarcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EletricCarControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EletricCarControlApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "kevin aguiar dos santos rm:87268\n"
				+ "natasha miyara martins rm:89183\n"
				+ "Rafael fernandes cunha:88687\n"
				+ "carlos daniel silveira do nascimento:88439\n"
				+ "\n"
				+ "solução:\n"
				+ "a solução realizada pelo grupo foi criar um app que incentive o uso de veiculos autonomos, assim empresas parceiras se cadastram e abastecem em nossos pontos";
	}
}
