package views;
import java.util.Scanner;
public class Menu {
	static int renderizar(){
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\n _____________________________");
		System.out.println(" Bem vindo ao software de folha de pagamento!\n");
		System.out.println("\n Digite a op��o desejada no menu a baixo:\n");
		System.out.println("\n Op��o 1 - Cadastrar funcion�rio");
		System.out.println("\n Op��o 2 - Cadastrar folha de pagamento");
		System.out.println("\n Op��o 3 - Consultar folha de pagamento");
		System.out.println("\n Op��o 4 - Consultar historico de folhas de pagamento do m�s");
		System.out.println("\n Op��o 0 - Sair\n");
		System.out.println("\n Digite a op��o escolhida:");
		op = teclado.nextInt();
		return op;
	}
}