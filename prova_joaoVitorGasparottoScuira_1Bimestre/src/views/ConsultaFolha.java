package views;
import java.util.Scanner;

import models.FolhaPagamento;
import models.Funcionario;
import controllers.FolhaController;
public class ConsultaFolha {

	private static FolhaPagamento folhaConsultar;
	private static Funcionario funcionarioConsultar;
	private static Scanner teclado = new Scanner (System.in);
	
	public static void renderizar() {
		folhaConsultar = new FolhaPagamento();
		funcionarioConsultar = new Funcionario();
		System.out.println("\n Consulta a folha de pagamento! \n");
		teclado = new Scanner(System.in);
		System.out.println("\n Informe o CPF do funcionario: \n");
		funcionarioConsultar.setCpf(teclado.nextLine());
		folhaConsultar.setFuncionario(funcionarioConsultar);
		System.out.println("\n Informe o mes: \n");
		folhaConsultar.setMesFolha(teclado.nextInt());
		System.out.println("\n Informe o ano: \n");
		folhaConsultar.setAnoFolha(teclado.nextInt());
		
		if (FolhaController.buscarPorCpf(folhaConsultar)) {
			if (FolhaController.buscarPorAno(folhaConsultar.getAnoFolha())) {
				if(FolhaController.buscarPorMes(folhaConsultar.getMesFolha())) {
					System.out.println("Deu bom.");
				}
			}
		}
		else {
			System.out.println("Deu ruim.");
		}
	}

}
