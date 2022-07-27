/*
	AS1 Métodos de Pesquisa e Ordenação em Estruturas de Dados

	Marina Elizabeth Mazuroski
	Jessica Ligeiro Ferreira
	Chrystian Marllon Soares Dutra

 */

public class Lista {
	private No primeiro;

	public Lista() {
		this.primeiro = null;
	}

	public boolean vazia() { // Checa se a lista está vazia através do primeiro elemento
		return primeiro == null;
	}

	public No buscar (int info) { // Busca um determinado nó pela sua informação
		if (vazia()) {
			System.out.println("Lista vazia");
			return null;
		}
		else {
			No auxiliar = primeiro;

			// Loop pelos nós buscando informação desejada
			while (auxiliar.getInformacao() != info) {
				auxiliar = auxiliar.getProximo();
			}
			return auxiliar;
		}
	}

	public void inserePrimeiro(int info) {
		No auxiliar = new No();

		// Carregando informações no novo nó
		auxiliar.setInformacao(info);
		auxiliar.setProximo(primeiro);

		// Posicionando novo nó como primeiro
		primeiro = auxiliar;
	}

	public void insereDepois(No no, int info) {
		No novo = new No();
		No auxiliar = primeiro;

		// Loop pelos nós até chegar no desejado
		while (no != auxiliar) {
			auxiliar = auxiliar.getProximo();
		}

		// Carregando informações do novo nó
		novo.setInformacao(info);
		novo.setProximo(auxiliar.getProximo());

		// Inserindo novo nó na lista
		auxiliar.setProximo(novo);
	}

	public void insereUltimo(int info) {
		if (vazia()) {
			// Se a lista estiver vazia, novo nó será colocado como primeiro
			inserePrimeiro(info);
		}
		else {
			No auxiliar = primeiro;
			// Loop pelos nós até chegar no último, cujo "próximo nó" é nulo
			while (auxiliar != null && auxiliar.getProximo() != null) {
				auxiliar = auxiliar.getProximo();
			}

			if (auxiliar.getProximo() == null) {
				// Carrega informação do novo nó, mantendo "próximo nó" como nulo
				No novo = new No();
				novo.setInformacao(info);

				// Insere último nó na lista através do nó anterior
				auxiliar.setProximo(novo);
			}
		}
	}

	public No removePrimeiro() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return null;
		}
		else {
			// Salva informação do nó removido
			No removido = primeiro;

			// Redefine segundo nó como novo primeiro nó
			primeiro = primeiro.getProximo();
			return removido;
		}
	}

	public No removeUltimo() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return null;
		}

		else if (this.primeiro.getProximo() == null) {
			// Se a lista possuir apenas um elemento, remove o primeiro
			return removePrimeiro();
		}

		else {
			No auxiliar = primeiro;
			No proximo = auxiliar.getProximo();

			// Loop pelos nós até que o auxiliar seja o penúltimo da lista
			while (auxiliar != null && proximo.getProximo() != null) {
				auxiliar = proximo;
				proximo = auxiliar.getProximo();
			}

			// Salva informação do nó removido
			No removido = new No();
			removido.setInformacao(proximo.getInformacao());

			// Remove último da lista
			auxiliar.setProximo(null);
			return removido;
		}
	}

	public No remove (No no) {
		No auxiliar = primeiro;
		No proximo = auxiliar.getProximo();

		// Se o nó a ser removido for o primeiro, chama função para remover primeiro
		if (no == primeiro) {
			return removePrimeiro();
		}

		else {
			// Loop pelos nós até encontrar nó desejado e seu anterior
			while (proximo != no) {
				auxiliar = proximo;
				proximo = auxiliar.getProximo();
			}
			// Remove nó através do anterior
			auxiliar.setProximo(proximo.getProximo());
			return no;
		}
	}

	public void mostrar() { // Mostra lista
		No auxiliar = primeiro;
		while (auxiliar != null) {
			System.out.print(auxiliar.getInformacao()+" ");
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();
	}
}
