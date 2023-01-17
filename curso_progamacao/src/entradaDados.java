import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		//entrada de dados java//
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String x;
		System.out.println("Digite Seu nome");

		x = sc.next();
	
		
		int a;
		System.out.println("Digite sua idade");
		
		a = sc.nextInt();

		
		double b;
		System.out.println("Digite sua Altura");
		
		b =sc.nextDouble();
		

		
		char t;
		System.out.println("Digite F para sexo feminino ou M para masculino ");
		 
		t = sc.next().charAt(0);

		System.out.println("Seu Nome é:" + x);
		System.out.println("Sua idade é:" + a);
		System.out.println("Sua altura é:" + b);		
		System.out.println("Sexo: " + t);
		
		
		
sc.close();
	}

}
