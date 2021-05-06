package controllers;

import models.FolhaPagamento;

import java.util.ArrayList;

public class FolhaController {

	private static ArrayList<FolhaPagamento> folhasPagamentos = new ArrayList<FolhaPagamento>();
	public static ArrayList<FolhaPagamento> listar(){
		return folhasPagamentos;
	}
	
	public static boolean cadastrar(FolhaPagamento folhaPagamento) {
		if((FuncionarioController.listar()).contains(folhaPagamento.getFuncionario()) ) {
			folhasPagamentos.add(folhaPagamento);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean buscarPorMes(int mesFolha) {
		for (FolhaPagamento folhaPagamentoCadastrado:folhasPagamentos) {
			if (folhaPagamentoCadastrado.getMesFolha() == (mesFolha)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean buscarPorAno(int anoFolha) {
		for (FolhaPagamento folhaPagamentoCadastrado:folhasPagamentos) {
			if (folhaPagamentoCadastrado.getMesFolha() == (anoFolha)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean buscarPorCpf(FolhaPagamento folhaPagamento) {
		if((FuncionarioController.listar()).contains(folhaPagamento.getFuncionario()) ) {
			return true;
		}
		else {
			return false;
		}
	}	
}
