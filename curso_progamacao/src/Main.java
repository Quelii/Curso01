import java.util.Locale;
public class Main {

	public static void main(String[] args) {

		System.out.println("Olá Mundo!"+"somos dois");
		System.out.println("Bom Dia");
		int idade = 25;
		char sexo = 'F';
		String nome ="Maria";
		double renda=4000.00;
		
		System.out.println(idade);
		System.out.println(sexo);
		double x =10.1354;
		
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n", x);
		System.out.println("Resultado = " + x +" metros");
		System.out.printf("Resultado = %.2f metros %n",x);
		
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n",nome, idade,renda);

		

	}

}
