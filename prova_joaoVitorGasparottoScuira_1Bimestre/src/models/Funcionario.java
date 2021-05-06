package models;
import java.util.Date;
public class Funcionario {

	public Funcionario() {
		setCriadoEm(new Date());
	}
	
	private String funcionario;
	private String cpf;
	private Date dataNascimento;
	private Date criadoEm;
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	public boolean equals(Object obj) {
		Funcionario outroFuncionario = (Funcionario) obj;
		return getCpf().equals(outroFuncionario.getCpf());
	}
	
	
	public String toString() {
		return "Nome: " + getFuncionario() + " | CPF: " + getCpf() + " | Data de nascimento " + getDataNascimento()
		+ "| Criado em: " +getCriadoEm()+"\n";
	}

	
}
