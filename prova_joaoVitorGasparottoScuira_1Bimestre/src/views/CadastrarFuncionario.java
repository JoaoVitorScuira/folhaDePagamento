package views;
import models.Funcionario;
import java.util.Scanner;
import java.util.Date;
import controllers.FuncionarioController;

public class CadastrarFuncionario {
	private static Funcionario funcionario;
	private static Scanner teclado = new Scanner (System.in);
	
	public static void renderizar() {
		funcionario = new Funcionario();
		System.out.println("\n Cadastro de funcionarios\n");
		teclado = new Scanner(System.in);
		System.out.println("Digite o nome do funcionario:");
		funcionario.setFuncionario(teclado.nextLine());
		System.out.println("Digite o CPF do funcionario:");
		funcionario.setCpf(teclado.nextLine());
		System.out.println("Digite a data de nascimento do funcionario:");
		funcionario.setDataNascimento(new Date());
		
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\n Funcionario cadastrado com sucesso!\n");
		}
		else {
			System.out.println("\nEsse funcionario já existe!\n");
		}
	}
	
	
	
}
