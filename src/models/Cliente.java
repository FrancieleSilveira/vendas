package models;
import java.util.Date;

//Modificador de acesso - public, private e protect
public class Cliente {
	
	public Cliente() {
		this.criadoEm = new Date();
	}
	
	//Característica, atributo ou propriedade
	//O atributo de uma classe de modelo, sempre deve ser privado!
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	//Getters and Setters
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
