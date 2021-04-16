package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public void gravar() {
		System.out.println("Gravou " + this.livro.getTitulo() );
	}

	public Livro getLivro() {
		return livro;
	}

}
