package views;

import java.util.Scanner;

import utils.Console;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --");
			System.out.println("\n1 - Cliente");
			System.out.println("2 - Vendedor");
			System.out.println("3 - Produto");
			System.out.println("4 - Venda");
			System.out.println("5 - Sair");
			opcao = Console.lerInteiro("\nDigite a opção desejada: ");
			
			switch (opcao) {
			case 1:
				MenuCliente.renderizar();
				break;
			case 2:
				MenuVendedor.renderizar();
				break;
			case 3:
				MenuProduto.renderizar();
				break;
			case 4:
				MenuVenda.renderizar();
				break;
			case 5:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		}while (opcao != 5);
	}		
}
