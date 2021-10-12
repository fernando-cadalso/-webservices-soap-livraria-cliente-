package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {

		/*
		 * Instancia a classe que sabe fazer a chamada ao webservice
		 * O cliente é uma interface que conhece todos os métodos
		 * que o webservice oferece.
		 * É uma chamada HTTP POST enviando SOAP.
		 */
		LivrariaWS cliente = new LivrariaWSProxy();
		Livro[] livrosPeloNome = cliente.getLivrosPeloNome("J");
		for (Livro livro : livrosPeloNome) {
			System.out.printf("Título: %s, Autor: %s%n", 
								livro.getTitulo(), 
								livro.getAutor().getNome());
			
		}
	}

}
