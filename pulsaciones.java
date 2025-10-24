import java.util.Scanner;
	public class pulsaciones{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int edad, pulsaciones;
		System.out.println("dame tu edad");
		edad=sc.nextInt();
		pulsaciones=(220-edad)/10;
			System.out.println("tu edad es de " + edad + " y el numero de pulsaciones es de " + pulsaciones);
			sc.close();
	}
	}