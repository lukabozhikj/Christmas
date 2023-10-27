package proekt8;
import java.util.Scanner;
public class ITERATOR {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int i,n;
		System.out.print ("Do brojot:");
		n=input.nextInt ();
		i=1;
		while(1<=n)
		{
			if(i%5==0)
			{
				System.out.println(i);
				}
	                
			     i=i+1;
	             }
	}
}
