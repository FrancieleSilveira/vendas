package controllers; //Um controller para cada modelo, dentro dele colocamos as ações que podem ser executadas com cada modelo (cadastrar, listar, buscar...) 

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static ArrayList<Cliente> listar() {
		return clientes;
	}
	
	public static boolean cadastrar(Cliente cliente) {
		if(buscarPorCpf(cliente.getCpf()) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	public static boolean deletar(Cliente cliente) {
		for(Cliente clienteCadastrado : clientes) {
			if(cliente.getCpf().equals(clienteCadastrado.getCpf())) {
				clientes.remove(clienteCadastrado);
				return true;
			}
		}
		return false;
	}
	
	public static boolean alterar(String nome, String cpf) {
		for(Cliente clienteCadastrado : clientes) {
			if(cpf.equals(clienteCadastrado.getCpf())) {
				clienteCadastrado.setNome(nome);
			return true;
			}
		}
		return false;
	}

	
	public static Cliente buscarPorCpf(String cpf) {
		for(Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
		
	}
}



