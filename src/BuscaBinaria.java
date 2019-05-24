

public class BuscaBinaria {

	public static void main(String[] args) {
		int vetor[] = { 0, 3, 23, 34, 47, 55, 65, 82, 87, 99 };
		
		System.out.println("O número procurado está na posição: " + busca(vetor, 82));

	}

	public static int busca(int[] array, int numero) {
		return buscaBinaria(array, 0, array.length-1, numero);

	}
	
	public static int buscaBinaria(int[] array, int esqueda, int direita, int numero) {
		
		int media = (direita + esqueda)/2;
		int valorMeio = array[media];
		
		if(esqueda > direita) {// caso base
			return -1;
		}else if(valorMeio == numero) {
			return media;
		}else if(valorMeio < numero) {
			return buscaBinaria(array, media + 1, direita, numero);
		}else {
			return buscaBinaria(array, esqueda, media - 1, numero);
		}
	}
}
