import java.util.Scanner;
	public class salario{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double s, sn;
		System.out.println("dime tu salario");
		s=sc.nextDouble();
		sn=s*1.25;
			System.out.println("tu nuevo salario es de " + sn);
			sc.close();
	}
	}