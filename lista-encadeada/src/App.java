/*
	AS1 Métodos de Pesquisa e Ordenação em Estruturas de Dados

	Marina Elizabeth Mazuroski
	Jessica Ligeiro Ferreira
	Chrystian Marllon Soares Dutra

 */

public class App {

	public static void main(String[] args) {
		Lista l = new Lista();
		System.out.println("------Lista original-----");
		l.insereUltimo(10);
		l.insereUltimo(20);
		l.insereUltimo(30);
		l.insereUltimo(40);
		l.mostrar();

		System.out.println("\n------Inserindo por primeiro------");
		l.inserePrimeiro(5);
		l.mostrar();

		System.out.println("\n------Inserindo por último------");
		l.insereUltimo(50);
		l.mostrar();

		System.out.println("\n------Removendo o primeiro elemento------");
		No removido = l.removePrimeiro();
		l.mostrar();
		System.out.println("Removido: "+removido.getInformacao());

		System.out.println("\n------Removendo o último elemento------");
		removido = l.removeUltimo();
		l.mostrar();
		System.out.println("Removido: "+removido.getInformacao());

		System.out.println("\n------Inserindo no meio da lista------");
		No no = l.buscar(20);
		if (no != null) {
			l.insereDepois(no, 60);
			l.mostrar();
		} else {
			System.out.println("Nó não encontrado");
		}

		System.out.println("\n------Removendo do meio da lista------");
		no = l.buscar(60);
		if (no != null) {
			removido = l.remove(no);
			l.mostrar();
			System.out.println("Removido: "+removido.getInformacao());
		} else {
			System.out.println("Nó não encontrado");
		}

	}
}
