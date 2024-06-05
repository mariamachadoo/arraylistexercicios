package exerciciosvetor;

import java.util.ArrayList;

public class ArrayInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int soma=0;
		
		numeros.add(6);
		numeros.add(12);
		numeros.add(18);
		numeros.add(24);
		numeros.add(30);
		
		for(int numero : numeros) {
			soma=soma + numero;
		}
		System.out.println(soma);

	}

}
