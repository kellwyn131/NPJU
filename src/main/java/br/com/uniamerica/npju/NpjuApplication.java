package br.com.uniamerica.npju;

import br.com.uniamerica.npju.Entity.Assistido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NpjuApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpjuApplication.class, args);
	}

	Assistido assistido = new Assistido();


}
