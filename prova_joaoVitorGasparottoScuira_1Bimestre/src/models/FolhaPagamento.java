package models;

public class FolhaPagamento {
	
	private Funcionario funcionario;
	private int mesFolha;
	private int anoFolha;
	private int horasTrabalhadas;
	private double valorHora;
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public int getMesFolha() {
		return mesFolha;
	}
	public void setMesFolha(int mesFolha) {
		this.mesFolha = mesFolha;
	}
	public int getAnoFolha() {
		return anoFolha;
	}
	public void setAnoFolha(int anoFolha) {
		this.anoFolha = anoFolha;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public boolean equals(Object obj) {
		FolhaPagamento outraFolhaPagamento = (FolhaPagamento) obj;
		return getFuncionario().equals(outraFolhaPagamento.getFuncionario());
	}
	
	public String toString() {
		return "Funcionario: " + getFuncionario() + " | Mes: " + getMesFolha() + " | Ano: " + getAnoFolha()
		+"\n";
	}
	
	
}
