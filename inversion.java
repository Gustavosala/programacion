import java.util.Scanner;
	public class inversion{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double d, c;
		System.out.println("dime la cantidad dada al banco");
		c=sc.nextDouble();
		d=c*0.02;
			System.out.println("la cantidad ganada en un mes es de " + d);
			sc.close();
	}
	}