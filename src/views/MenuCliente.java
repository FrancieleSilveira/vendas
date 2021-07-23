package views;

import java.util.Scanner;

public class MenuCliente {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		
		int op;
		
		do {
			System.out.println("\n-- MENU CLIENTE --");
			System.out.println("\n1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Alterar cliente");
			System.out.println("4 - Deletar cliente");
			System.out.println("0 - Voltar ao menu anterior");
			System.out.println("\nDigite a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				CadastrarCliente.renderizar();
				break;
			case 2:
				ListarClientes.renderizar();		
				break;
			case 3:
				AlterarCliente.renderizar();
				break;
			case 4:
				DeletarCliente.renderizar();
				break;
			case 0:
				System.out.println("\nVoltando...");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		
		} while (op != 0);
	}
	
	
	
}
