package exerciciosvetor;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(10);//Adicionando elementos ao ArrayList
		numeros.add(20);
		
		System.out.println(numeros.get(0)); //Saída: 10 //Acessando elementos do ArrayList
		System.out.println(numeros.get(1)); //Saída: 20
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); //Saída: 25 //Modificando um elemento do ArrayList
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); //Saída: 25 //Removendo um elemento do ArrayList
		
		System.out.println(numeros.size()); //Saída: 1 //Obtendo o tamanho do ArrayList
	}

}
