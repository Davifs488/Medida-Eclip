package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		 * Projeto que faz a medida de triangulo
		 *Digite seis valores e no final veja o resultado
		 * 
		 * 
		 */
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the mauseres of trianger x:  ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the mauseres of trianger x:  ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		
		double areaY = y.area();
		
		System.out.printf("Triangle x area: %.4f\n " , areaX);
		System.out.printf("Triangle x area: %.4f\n " , areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: x");
		}else {
			System.out.printf("Larger area :y ");
		}
	}

}
