import java.util.Scanner;
	public class radio{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double radio, area, longitud;
		System.out.println("dame el radio");
		radio=sc.nextDouble();
		longitud=2*Math.PI*radio;
		area=Math.PI*Math.pow(radio,2);
			System.out.println("la longitud del circulo es " + longitud + " y su area es de " + area);
			sc.close();
	}
	}