import java.util.Scanner;
	public class calificacion{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double c1, c2, c3, p;
		System.out.println("dame tu primera calificacion");
		c1=sc.nextDouble();
		System.out.println("dame tu segunda calificacion");
		c2=sc.nextDouble();
		System.out.println("dame tu tercera calificacion");
		c3=sc.nextDouble();
		p=(c1+c2+c3)/3;
			System.out.println("el promedio de tu calificación es de " + p);
			sc.close();
	}
	}
		