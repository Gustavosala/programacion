import java.util.Scanner;
	public class temperatura{
	public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	double c, f, ta;
		System.out.println("dame la temperatura en grados centigrados");
		c=sc.nextDouble();
		f=(c*9/5)+32;
		ta=c+273.15;
			System.out.println("los centígrados " + c + " equivalen a " + f + " Fahrenheit y a " + ta + " temperatura absoluta");
			sc.close();
	}
	}