package views;

import java.util.Scanner;

public class MenuVenda {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		
		int op;
		
		do {
			System.out.println("\n-- MENU VENDA --");
			System.out.println("\n1 - Cadastrar venda");
			System.out.println("2 - Listar vendas");
			System.out.println("3 - Alterar venda");
			System.out.println("4 - Deletar venda");
			System.out.println("0 - Voltar ao menu anterior");
			System.out.println("\nDigite a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				CadastrarVenda.renderizar();
				break;
			case 2:
				//ListarVendas.renderizar();		
				break;
			case 3:
				//AlterarVenda.renderizar();
				break;
			case 4:
				//DeletarVenda.renderizar();
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