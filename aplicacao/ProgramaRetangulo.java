package retangulo.aplicacao;

import java.util.Scanner;

import retangulo.entidade.Retangulo;

public class ProgramaRetangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Retangulo x = new Retangulo();
		
		
		System.out.println("Digite a largura do retângulo: ");
		x.largura = sc.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		x.altura = sc.nextDouble();
		
		double areaX = x.area();
		
		System.out.printf("Área do Retângulo X: %.2f%n", areaX);

		double perimetroX = x.perimetro();
		
		System.out.printf("Perímetro do Retângulo X: %.2f%n", perimetroX);
		
		double diagonalX = x.diagonal();
		
		System.out.printf("Diagonal do Retângulo X: %.2f%n", diagonalX);
		
	}
	
	
}
