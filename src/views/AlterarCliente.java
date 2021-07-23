package views;

import java.util.Scanner;

import controllers.ClienteController;

import models.Cliente;

public class AlterarCliente {
	
	private static Cliente cliente;
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		
		cliente = new Cliente();
		
		System.out.println("\n".repeat(20));
		System.out.println("\n-- ALTERAR CLIENTE --\n");
		System.out.println("Digite o CPF do cliente que deseja alterar: ");
		cliente.setCpf(sc.next());
		System.out.println("\nNovo nome: ");
		cliente.setNome(sc.next());
		
		if(ClienteController.alterar(cliente.getNome(), cliente.getCpf())) {
			System.out.println("\nCliente alterado com sucesso!");
		}else {
			System.out.println("Esse cliente não existe!");
		}
	}
}