import java.util.Scanner;
	public class porcentaje{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int h, m, Ph, Pm, t;
		System.out.println("dame la cantidad de hombres");
		h=sc.nextInt();
		System.out.println("dame la cantidad de mujeres");
		m=sc.nextInt();
		t=h+m;
		Ph=h*100/t;
		Pm=m*100/t;
			System.out.println("el porcentaje de hombres es de " + Ph + "%");
			System.out.println("el porcentaje de mujeres es de " + Pm + "%");
			sc.close();
	}
	}