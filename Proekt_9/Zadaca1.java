package Proekt_9;
import java.util.Scanner;
public class Zadaca1 {
	public static void main(String[] args) {
		double c,f,i;
		System.out.println("Vnesi go brojot:");
		Scanner input=new Scanner(System.in);
		c=input.nextInt();
		i=1;
		while(i<=c) {{
			i+=1;
			System.out.println(i);	
		}
            f=9*c/5+32;
            System.out.println(f);}
	}
}