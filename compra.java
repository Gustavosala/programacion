import java.util.Scanner;
	public class compra{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double c, pf;
		System.out.println("dame el precio de tu compra");
		c=sc.nextDouble();
		pf=c-(c*0.15);
			System.out.println("el valor a pagar de su compra es de " + pf);
			sc.close();
	}
	}