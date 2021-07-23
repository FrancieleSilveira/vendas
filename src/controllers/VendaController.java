package controllers; //Um controller para cada modelo, dentro dele colocamos as a��es que podem ser executadas com cada modelo (cadastrar, listar, buscar...) 

import java.util.ArrayList;

import models.Venda;

public class VendaController {
	
	private static ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	public static ArrayList<Venda> listar() {
		return vendas;
	}
	
	public static boolean cadastrar(Venda venda) {
			vendas.add(venda);
			return true;
	}
}
 
