package quickSort.lib;

public class Ordena {

	public Ordena() {
		
		super();
	
	}

	public int[] ordena(int[] vt, int inicio, int fim) {

		if (fim > inicio) {
			
			int pivoFixo = div(vt, inicio, fim);
			
			ordena(vt, inicio, pivoFixo - 1);
			ordena(vt, pivoFixo + 1, fim);
		
		}
		
		return vt;
	
	}
	
	private int div(int[] vt, int inicio, int fim) {
		
		int pivoInicio = vt[inicio];
		int esquerda = inicio + 1;
		int direita = fim;
		
		while (esquerda <= direita) {
			
			while (esquerda <= direita && vt[esquerda] <= pivoInicio) {
				
				esquerda++;
			
			}
			
			while (direita >= esquerda && vt[direita] > pivoInicio) {
				
				direita--;
			
			}
			
			if (esquerda < direita) {
				
				trocar(vt, esquerda, direita);
				esquerda++;
				direita--;
			
			}
		}
		
		trocar(vt, inicio, direita);
		int pivoFixo = direita;
		return pivoFixo;
	
	}
	
	private void trocar(int[] vt, int i, int j) {
		
		int aux = vt[i];
		vt[i] = vt[j];
		vt[j] = aux;
	
	}

}