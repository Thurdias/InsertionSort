package test;

public class InsertionSort {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		// preenche o vetor com números aleatórios
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		int aux, j;
		// Processamento (Insertion Sort)
		for(int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			while(j >= 0 && vetor[j] > aux) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = aux;
		}
		
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i]);
		    if (i != vetor.length - 1) {
		        System.out.print(", ");
		    }
		}
		System.out.println("]");
	}
}
