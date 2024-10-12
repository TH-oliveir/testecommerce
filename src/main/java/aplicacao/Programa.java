package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpa.domain.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmai.com");
		Pessoa p2 = new Pessoa(null, "eto", "eto@gmai.com");
		Pessoa p3 = new Pessoa(null, "gil", "gil@gmai.com");

		//Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager. 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		//encapsula uma conexão com a base de dados 
		
		EntityManager em = emf.createEntityManager();
		
		//buscando uma pessoa pelo id
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		
		
		
		System.out.println("pronto");
		em.close();
		emf.close();
		
		
		
		
	}

}
