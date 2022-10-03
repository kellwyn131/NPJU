package br.com.uniamerica.npju;

import br.com.uniamerica.npju.entity.ControleEstagiario;
import br.com.uniamerica.npju.entity.Estagiario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;


@SpringBootApplication
public class NpjuApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpjuApplication.class, args);

		//ControleEstagiario
		ControleEstagiario estagiario1 = new ControleEstagiario(5,2,3);
		ControleEstagiario estagiario2 = new ControleEstagiario(2,0,1);
		ControleEstagiario estagiario3 = new ControleEstagiario(4,2,5);

		ArrayList<ControleEstagiario> controle_estagiarios = new ArrayList<>();

		controle_estagiarios.add(estagiario1);
		controle_estagiarios.add(estagiario2);
		controle_estagiarios.add(estagiario3);

		for (int i=0;i<controle_estagiarios.size();i++){
			ControleEstagiario estagiario = (ControleEstagiario) controle_estagiarios.get(i);
			System.out.println("ESTAGIARIO " + (i+1));
			System.out.println(" Atendimentos Contemplados: " + estagiario.getAtendimentos_contemplados());
			System.out.println(" Atendimentos nao Contemplados: " + estagiario.getAtendimentos_nao_contemplados());
			System.out.println(" Atendimentos Convertidos: " + estagiario.getAtendimentos_convertidos());
		}

		//Estagiario
		Estagiario estagiario4 = new Estagiario("Marcos", "(45) 999237849","marcos@hotmail.com" );
		Estagiario estagiario5 = new Estagiario("Rafael", "(45) 984192233","rafael@hotmail.com" );
		Estagiario estagiario6 = new Estagiario("Julia", "(45) 998492361","julia@hotmail.com" );

		ArrayList<Estagiario> estagiarios = new ArrayList<>();

		estagiarios.add(estagiario4);
		estagiarios.add(estagiario5);
		estagiarios.add(estagiario6);

		for (int i=0;i<estagiarios.size();i++){
			Estagiario estagiario = (Estagiario) estagiarios.get(i);
			System.out.println("ESTAGIARIO " + (i+4));
			System.out.println(" Nome: " + estagiario.getNome());
			System.out.println(" Telefone: " + estagiario.getTelefone());
			System.out.println(" Email: " + estagiario.getEmail());
		}
	}
}
