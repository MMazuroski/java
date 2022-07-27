// Atividade Somativa 2
// Métodos de Pesquisa e Ordenação em Estrutura de Dados

// Edivaldo José dos Santos
// Marina Elizabeth Mazuroski

public class BubbleSort {

	void sortAsc(final int[] vetor) {

		int cont=0;
		int t;
		do {
			cont = 0;

			for (int i=0; i<(vetor.length - 1); i++) {
				if (vetor[i] > vetor[i+1]) {
					t = vetor[i+1];
					vetor[i+1] = vetor[i];
					vetor[i] = t;
					cont++;
				}
			}
		} while (cont!=0);
	}
}

