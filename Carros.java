package exerciciosvetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Carros {

	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
		int resp;
		
		car.add("Argo");
		car.add("HB20");
		car.add("Civic");
		car.add("Lamborghini");
		car.add("BMW");
		car.add("Creta");
		car.add("Uno");
		car.add("Kiwid");
		car.add("Onix");
		car.add("Porche");
		
		System.out.println(car);
		System.out.println("Informe o carro que gostaria de ver com um número de 0 a 9");
		resp = ler.nextInt();
		
		System.out.println(car.get(resp));
	}

}
