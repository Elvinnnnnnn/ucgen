package ucgen;

import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args) {
		
		double a, b, c, u ;
		
		double alankare, alan ;
		
		Scanner kenar1 = new Scanner(System.in);
		
		System.out.print("Üçgenin 1. Kenar Uzunluğunu Giriniz : ");
		
		a = kenar1.nextInt();
		
		Scanner kenar2 = new Scanner(System.in);
		
		System.out.print("Üçgenin 2. Kenar Uzunluğunu Giriniz : ");
		
		b = kenar2.nextInt();
		
		Scanner kenar3 = new Scanner(System.in);
		
		System.out.print("Üçgenin 3. Kenar Uzunluğunu Giriniz : ");
		
		c = kenar1.nextInt();
		
		u = (a+b+c)/2;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Üçgenin Alanı : " + alan);
		
		

	}

}
