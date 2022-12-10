package es.iessoterohernandez.daw.endes;

public class Fibonacci 
{
	private int longitud;

	public Fibonacci(int longitud) {
		this.longitud = longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public void mostrarSucesion() {
		System.out.println("\nSucesión de longitud "+ longitud +":");
		for (int i = 0; i < longitud; i++) {
			System.out.print(calcularFibonacci(i) + " ");
		}
	}

	private int calcularFibonacci(int posicion) {
		if (posicion > 1)
			return calcularFibonacci(posicion-1) + calcularFibonacci(posicion-2);
		else if (posicion == 1)
			return 1;
		else if (posicion == 0)
			return 0;
		else {
			System.out.println("ERROR: Posición no puede ser valor negativo");
			return -1;
		}
	}
	 
}
