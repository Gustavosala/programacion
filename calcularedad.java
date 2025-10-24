import java.util.Scanner;
	public class calcularedad{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int edad, año, actual;
		System.out.println("Dime el año actual");
		actual=sc.nextInt();
		System.out.println("Dame tu año de nacimiento");
		año=sc.nextInt();
		edad=actual-año;
			System.out.println("tu edad es " + edad + " años");
			sc.close();
	}
	}