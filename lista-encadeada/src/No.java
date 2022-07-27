/*
	AS1 Métodos de Pesquisa e Ordenação em Estruturas de Dados

	Marina Elizabeth Mazuroski
	Jessica Ligeiro Ferreira
	Chrystian Marllon Soares Dutra

 */

public class No {
	private Integer informacao;
	private No proximo;

	public No() {
		this.informacao = null;
		this.proximo = null;
	}

	public Integer getInformacao() {
		return informacao;
	}

	public void setInformacao(Integer informacao) {
		this.informacao = informacao;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
