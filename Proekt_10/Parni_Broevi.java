package Proekt_10;

import java.util.Scanner;
public class Parni_Broevi {
	public static void main(String[] args) {
	int a;
	System.out.println("| ZADACA - DOMASNA |");
	System.out.println("| Vnesi broevi koi ke bidat vo nizata:");
	Scanner tastatura = new Scanner(System.in);
	int[] Niza = new int[5];
	for (a = 0; a < Niza.length; a++) {
        Niza[a] = tastatura.nextInt();
	}
     int sumaOfEvenNumbers = 0;
     
     for (int Broj : Niza) {
    	 if (Broj % 2 == 0) {
    		 sumaOfEvenNumbers += Broj;
    	 }
     }
     System.out.println("Vkupniot zbir na parni broevi e;" + sumaOfEvenNumbers);
}
}