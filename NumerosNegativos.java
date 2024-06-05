package exerciciosvetor;
import java.util.ArrayList;
import java.util.Random;

public class NumerosNegativos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int soma=0;

		numeros.add(-6);
		numeros.add(12);
		numeros.add(-19);
		numeros.add(24);
		numeros.add(-33);

		for(int numero : numeros) {
			System.out.println(numero);
			if (numero < 0) {
				soma++;

			}

		}
		System.out.println("A quantidade dos números negativos é:" +soma);
	}
}
