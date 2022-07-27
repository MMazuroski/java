// Atividade Somativa 2
// Métodos de Pesquisa e Ordenação em Estrutura de Dados

// Edivaldo José dos Santos
// Marina Elizabeth Mazuroski

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		SelectSort s = new SelectSort();
		int[] vetor1 = {3, 6, 8, 1, 4, 9, 0};

		s.sortAsc(vetor1);

		System.out.println("Select sort");
		System.out.println(Arrays.toString(vetor1));


		BubbleSort b = new BubbleSort();
		int[] vetor2 = {3, 6, 8, 1, 4, 9, 0};

		b.sortAsc(vetor2);

		System.out.println("Bubble sort");
		System.out.println(Arrays.toString(vetor1));

	}
}
