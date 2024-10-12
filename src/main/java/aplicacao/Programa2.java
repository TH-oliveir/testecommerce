package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpa.domain.Pessoa;

public class Programa2 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmai.com");
		Pessoa p2 = new Pessoa(null, "eto", "eto@gmai.com");
		Pessoa p3 = new Pessoa(null, "gil", "gil@gmai.com");

		//Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager. 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		//encapsula uma conexão com a base de dados 
		
		EntityManager em = emf.createEntityManager();
		
		//iniciando uma transação com banco de dados.
		em.getTransaction().begin();
		
		//inserindo no pessoas no banco de dados.
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		//confirmando transação
		em.getTransaction().commit();
		System.out.println("pronto");
		
		
		
		
		
		
		
		
		
	}

}
