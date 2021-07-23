package views;

import java.util.Scanner;

public class MenuVendedor {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		
		int op;
		
		do {
			System.out.println("\n-- MENU VENDEDOR --");
			System.out.println("\n1 - Cadastrar vendedor");
			System.out.println("2 - Listar vendedores");
			System.out.println("3 - Alterar vendedor");
			System.out.println("4 - Deletar vendedor");
			System.out.println("0 - Voltar ao menu anterior");
			System.out.println("\nDigite a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				CadastrarVendedor.renderizar();
				break;
			case 2:
				ListarVendedores.renderizar();		
				break;
			case 3:
				//AlterarVendedor.renderizar();
				break;
			case 4:
				//DeletarVendedor.renderizar();
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