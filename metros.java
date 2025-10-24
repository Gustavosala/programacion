import java.util.Scanner;
public class metros{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	double pies, pulgadas, metros;

		System.out.println("Ingrese los metros: ");
		metros=sc.nextDouble();
		pies = metros*3.28084;
		pulgadas = metros*39.3701;
			System.out.println("Los " + metros + " equivalen a " + pies + " pies y a " + pulgadas + " pulgadas");
			sc.close();
	}
	}
	
	
	
	