import java.util.Scanner;

public class Paridad {
	public static void main (String[]Args){
		Scanner S = new Scanner(System.in);

		System.out.println("Introduzca el numero a comparar");
		int num = S.nextInt();

		if(num%2 != 0){
			System.out.println("El numero es impar");
		}
		System.out.println("El numero es par");
	}

}
