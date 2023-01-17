import java.util.Scanner;

public class execicio2 {

	public static void main(String[] args) {
		int a;
		int b;
		int soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primerio valor");
		a = sc.nextInt();
		System.out.println("Digite o Segundo valor");
		b = sc.nextInt();

		soma = a + b;
		System.out.println("A soma de A + B é Igua a: " + soma);

		sc.close();
	}

}
