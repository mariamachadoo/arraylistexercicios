package exerciciosvetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Acai {

	public static void main(String[] args) {
		ArrayList<String> ingre = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
		int ret;
		
		ingre.add("Leite condensado");
		ingre.add("Leite em pó");
		ingre.add("Morango");
		ingre.add("Banana");
		ingre.add("Granola");
		
		System.out.println("Os ingredientes do açai da casa é: " +ingre);
		
		System.out.println("Gostaria de retirar um ingrediente?[1] Gostaria de adicionar um ingrediente?[2] Gostaria de deixar assim?[3]");
		ret = ler.nextInt();
		
		if (ret == 1) {
			System.out.println("Qual ingrediente você deseja retirar de 0 a 4");
			ingre.remove(ler.nextInt());
			System.out.println(ingre);
			
		}
		else if (ret == 2) {
			System.out.println(("Qual ingrediente gostaria de adicionar?"));
			ingre.add(ler.next());
			System.out.println(ingre);
		}
		else System.out.println(ingre);
	}

}
