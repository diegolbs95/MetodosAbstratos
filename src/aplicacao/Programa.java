package aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Forma #"+(i+1)+" data:");
			System.out.print("Rentandulo ou Circulo (r / c)? ");
				char f = sc.next().charAt(0);
			System.out.print("Cor (Preto/Azul/Vermelho): ");
				Cor cor = Cor.valueOf(sc.next());
		
			if (f == 'r') {	
				
				System.out.print("largura: ");
				double largura = sc.nextDouble();
				System.out.print("altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, altura, largura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
			
		}
			System.out.println();
			System.out.println("Area da forma: ");
			for (Forma forma:lista) {
				System.out.println(String.format("%.2f", forma.area()));
				
			} 
			
			
		
		
		
		sc.close();
	}

}
