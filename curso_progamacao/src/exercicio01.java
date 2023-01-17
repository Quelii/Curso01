import java.util.Locale;

public class exercicio01 {

	public static void main(String[] args) {
		String product1 ="Computer";
		String product2 = "office desk";
		int age = 30;
		int code = 5290;
		char gender ='f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure =53.234567;
		
		System.out.printf("%s, which is R$ %.1f%n", product1, price1);
		System.out.println(product2 + ", whict is "+price2);
		System.out.println(age + " years old, code "+ code +" and gender: " + gender);
		System.out.printf("Measue eith eight decimal places: %s %n", measure);
		System.out.printf("Rounded (three decimal places):%.6s %n", measure);
		Locale.setDefault(new Locale("pt","BR"));
		System.out.printf("Rounded (Taça decimal places):%.6s %n", measure);

	}

}
