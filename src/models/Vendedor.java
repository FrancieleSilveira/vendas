package models;
import java.util.Date;

//Modificador de acesso - public, private e protect
public class Vendedor {
	
	public Vendedor() {
		this.criadoEm = new Date();
	}
	
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + cpf + " | Criado em: " + criadoEm;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		return cliente.getNome() == nome && cliente.getCpf() == cpf; //retorna true ou false
	}
	
}