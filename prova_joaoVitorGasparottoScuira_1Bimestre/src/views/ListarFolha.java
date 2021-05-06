package views;
import models.FolhaPagamento;
import controllers.FolhaController;

public class ListarFolha {

	public static void renderizar() {
		System.out.println("Testando para ver se esta funcionando");
		for (FolhaPagamento folhaPagamentoCadastrado: FolhaController.listar()) {
			System.out.println(folhaPagamentoCadastrado);
		}
	}
}
