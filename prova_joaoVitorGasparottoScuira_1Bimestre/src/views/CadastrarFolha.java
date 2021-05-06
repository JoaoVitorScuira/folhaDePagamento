package views;

import java.util.Scanner;

import controllers.FolhaController;
import models.Funcionario;
import models.FolhaPagamento;

public class CadastrarFolha {
	private static FolhaPagamento folhaPagamento;
	private static Funcionario funcionarioFolha;
	private static Scanner teclado = new Scanner (System.in);
	
	public static void renderizar() {
	folhaPagamento = new FolhaPagamento();
	System.out.println("\n --Cadastro de Folha de Pagamento--\n");
	teclado = new Scanner (System.in);
	
	
	funcionarioFolha = new Funcionario();
	System.out.println("\n Digite o CPF do Funcionario: ");
	funcionarioFolha.setCpf(teclado.nextLine());
	
	folhaPagamento.setFuncionario(funcionarioFolha);
	
	System.out.println("\n Digite o mes:");
	folhaPagamento.setMesFolha(teclado.nextInt());
	
	
	System.out.println("\n Digite o ano: ");
	folhaPagamento.setAnoFolha(teclado.nextInt());
	
	
	System.out.println("\n Digite o numero de horas trabalhadas: ");
	folhaPagamento.setHorasTrabalhadas(teclado.nextInt());
	
	System.out.println("\n Digite o valor da hora do funcionario");
	folhaPagamento.setValorHora(teclado.nextDouble());
	
	if(FolhaController.cadastrar(folhaPagamento)) {
		System.out.println("\n  Folha de pagamento cadastrada com sucesso!!  \n");
	}
	else {
		System.out.println("\n  Essa folha de pagamento ja foi cadastrada anteriormente!! \n");
	}
	}
}