package br.com.uniamerica.npju;

import br.com.uniamerica.npju.Entity.Assistido;
import br.com.uniamerica.npju.Entity.ControleEstagiario;
import br.com.uniamerica.npju.Entity.Endereco;
import br.com.uniamerica.npju.Entity.Estagiario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NpjuApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpjuApplication.class, args);


		Assistido joao = new Assistido("joao", "09800707707", "99337698");
		Assistido maria = new Assistido("maria", "07689988778", "99221290");
		Assistido felipe = new Assistido("felipe", "96756498001", "35253349");

		ArrayList<Assistido> assistidos = new ArrayList<Assistido>();
		assistidos.add(joao);
		assistidos.add(maria);
		assistidos.add(felipe);

		for(Assistido cliente: assistidos){
			System.out.println(cliente.getNome());
			System.out.println(cliente.getCpf());
			System.out.println(cliente.getTelefone());
		}

		Endereco Jendereco = new Endereco("Rua Xavier da silva", "centro", "86867029");
		Endereco Mendereco = new Endereco("Avenida Brasil", "centro", "86867029");
		Endereco Fendereco = new Endereco("Avenida Almirante Barroso", "centro", "86867029");

		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(Jendereco);
		enderecos.add(Mendereco);
		enderecos.add(Fendereco);

		for(Endereco end: enderecos){
			System.out.println(end.getRua());
			System.out.println(end.getBairro());
			System.out.println(end.getNumero());
		}

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
			System.out.println(" Atendimentos Contemplados: " + estagiario.getAtendimentosContemplados());
			System.out.println(" Atendimentos nao Contemplados: " + estagiario.getAtendimentosNaoContemplados());
			System.out.println(" Atendimentos Convertidos: " + estagiario.getAtendimentosConvertidos());
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
