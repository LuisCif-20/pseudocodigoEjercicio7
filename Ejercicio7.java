import java.util.*;
public class Ejercicio7{
	public static void main(String[] args) {
		int contceros = 0;
		int porceros = 0;
		int contpar = 0;
		int contimpar = 0;
		int porpar = 0;
		int porimpar = 0;
		Random aleatorio = new Random();
		System.out.println("Los numeros generados por la ruleta son: ");
		for (int i = 0; i < 15 ; i++ ) {
			int numrandom;
			int par;
			numrandom = aleatorio.nextInt(37);
			System.out.println(numrandom);
			if (numrandom == 0) {
				contceros++;
			} else {
				par = numrandom%2;
				if (par == 0) {
					contpar++;
				} else {
					contimpar++;
				}
			}
		}
		porceros = contceros*(20/3);
		porpar = contpar*(20/3);
		porimpar = contimpar*(20/3);
		System.out.println("El porcentaje de ceros es de " + porceros + "%");
		System.out.println("El porcentaje de pares es de " + porpar + "%");
		System.out.println("El porcentaje de impares es de " + porimpar + "%");
	}
}