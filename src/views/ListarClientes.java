package views;

import controllers.ClienteController;
import models.Cliente;

public class ListarClientes {
	
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n-- LISTAR CLIENTES --\n");
		for(Cliente clienteCadastrado : ClienteController.listar())   // (1o tipo da lista, 2o nome que eu quero dar pro objeto : 3o nome da lista)
			System.out.println(clienteCadastrado);
	}
		
}


//for (int i = 0; i < clientes.size(); i++) { // .size retorna a quantidade de itens da lista
//System.out.println(clientes.get(i)); // .get pega uma posição específica da lista
//}
