import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		double raio;
		double r =3.14159;
		double area;
		double H; //raio
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o Raio");
		raio = sc.nextDouble();
		
		H = Math.pow(raio, 2.0);
		
		area = r *H;
		System.out.printf("O valor da area do Circolo é: %.4f ",area);
		
		sc.close();
	}

}
