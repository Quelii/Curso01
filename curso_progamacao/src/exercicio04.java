import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b ,c,d, dif;
		
		System.out.println("Digite o 1º Valor");
		a = sc.nextInt();
		System.out.println("Digite o 2º Valor");
		b = sc.nextInt();
		System.out.println("Digite o 3º Valor");
		c = sc.nextInt();
		System.out.println("Digite o 4º Valor");
		d = sc.nextInt();
		
		dif = ((a * b) - (c * d));
		
		System.out.println("Diferença = " + dif);
		
		sc.close();
	}

}
