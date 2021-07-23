package views;

import controllers.ProdutoController;
import models.Produto;

public class ListarProdutos {
	
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n-- LISTAR PRODUTOS --\n");
		for(Produto produtoCadastrado : ProdutoController.listar())   // (1o tipo da lista, 2o nome que eu quero dar pro objeto : 3o nome da lista)
			System.out.println(produtoCadastrado);
	}
		
}