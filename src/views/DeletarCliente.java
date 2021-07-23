package views;

import java.util.Scanner;

import controllers.ClienteController;

import models.Cliente;

public class DeletarCliente {
	
	private static Cliente cliente;
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		
		cliente = new Cliente();
		
		System.out.println("\n".repeat(20));
		System.out.println("\n-- DELETAR CLIENTE --\n");
		System.out.println("Digite o CPF do cliente que deseja deletar: ");
		cliente.setCpf(sc.next());
		
		if(ClienteController.deletar(cliente)) {
			System.out.println("\nCliente deletado com sucesso!");
		}else {
			System.out.println("Esse cliente não existe!");
		}
	}
}