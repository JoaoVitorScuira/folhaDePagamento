package views;
import java.util.Scanner;
public class Menu {
	static int renderizar(){
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\n _____________________________");
		System.out.println(" Bem vindo ao software de folha de pagamento!\n");
		System.out.println("\n Digite a opção desejada no menu a baixo:\n");
		System.out.println("\n Opção 1 - Cadastrar funcionário");
		System.out.println("\n Opção 2 - Cadastrar folha de pagamento");
		System.out.println("\n Opção 3 - Consultar folha de pagamento");
		System.out.println("\n Opção 4 - Consultar historico de folhas de pagamento do mês");
		System.out.println("\n Opção 0 - Sair\n");
		System.out.println("\n Digite a opção escolhida:");
		op = teclado.nextInt();
		return op;
	}
}