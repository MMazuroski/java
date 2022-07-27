// Atividade Somativa 2
// Métodos de Pesquisa e Ordenação em Estrutura de Dados

// Edivaldo José dos Santos
// Marina Elizabeth Mazuroski

public class SelectSort {

	void sortAsc(final int[] vetor) {

		for(int i = 0; i < vetor.length - 1; i++) {
			int menorN = i;
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[menorN] > vetor[j]) {
					menorN = j;
				}
			}
			if(menorN != i) {
				int t = vetor[i];
				vetor[i] = vetor[menorN];
				vetor[menorN] = t;
			}
		}
	}

}
