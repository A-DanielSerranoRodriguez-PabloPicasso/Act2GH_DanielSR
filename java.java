public class java{
	public void rellenarArray() {
		int[] array = new int[30];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.random()*11;
		}
	}

	public void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public void contarRepeticiones(int[] array) {
		int[] repeticiones = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			apariciones[i] = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					apariciones[i] += 1;
				}
			}
		}
	}
}
