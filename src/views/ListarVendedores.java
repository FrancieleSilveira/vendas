package views;

import controllers.VendedorController;
import models.Vendedor;

public class ListarVendedores {
	
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n-- LISTAR VENDEDORES --\n");
		for(Vendedor vendedorCadastrado : VendedorController.listar())   // (1o tipo da lista, 2o nome que eu quero dar pro objeto : 3o nome da lista)
			System.out.println(vendedorCadastrado);
	}
		
}