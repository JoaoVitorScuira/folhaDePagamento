package views;

import java.util.Scanner;

public class Principal {

public static void main (String args[]) {
	Scanner teclado = new Scanner(System.in);
	int op;
	
	do {
		op = Menu.renderizar();
		switch (op) {
			
			case 1 :
				CadastrarFuncionario.renderizar();
				break;
			case 2 :
				CadastrarFolha.renderizar();
				break;
			case 3 :
				ConsultaFolha.renderizar();
				break;
			case 4 :
				
				break;
			case 0 :
				System.out.println("\n\n\nFinalizando o programa!");
				break;
			default :
				System.out.println("Essa opção não existe: " + op +" - Digite a opção correta");
		}
	} while (op != 0);
	teclado.close();
}
}
