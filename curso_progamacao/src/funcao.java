
public class funcao {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = 25.0;
		double A, B, C;

		A = Math.sqrt(x); // raiz quadrada
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.println("A raiz quadrada de " + x + " é : " + A);
		System.out.println("A raiz quadrada de " + y + " é : " + B);
		System.out.println("A raiz quadrada de " + z + " é : " + C);

		A = Math.pow(x, y); // numero elevado a potencia
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + "elevado a " + y + " = " + A);
		System.out.println(x + "elevado a quadrado é = " + B);
		System.out.println("5 elevado ao quadrado é = " + C);

		A = Math.abs(y); // valor absoluto
		B = Math.abs(z);
		System.out.println("O valor absoluto de" + y +"é igual a: "+ A);
		System.out.println("O valor absoluto de" + x +"é igual a: "+ B);
	
	}

}
