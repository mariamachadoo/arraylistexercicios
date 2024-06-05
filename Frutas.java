package exerciciosvetor;

import java.util.ArrayList;

public abstract class Frutas {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<String>();

		frutas.add("uva");
		frutas.add("morango");
		frutas.add("kiwi");
		frutas.add("abacaxi");
		frutas.add("melão");
		frutas.add("mamão");
		frutas.add("banana");
		frutas.add("melancia");
		frutas.add("goiaba");
		frutas.add("pitanga");
		
		System.out.println("A lista é:" +frutas);
		
		frutas.remove(0);
		frutas.remove(2);
		frutas.remove(3);
		frutas.remove(4);
		frutas.remove(5);

        System.out.println("A lista removida é:" +frutas);
        System.out.println(frutas.size());

	}

}
