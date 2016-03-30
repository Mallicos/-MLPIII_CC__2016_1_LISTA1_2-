package br.unipe.mlpIII.Listas.modelo;

import java.util.List;

public class Inventorio{
	
	public String colecaoVazia(List<Item> item){
		
		if(item.isEmpty())
			return "coleção vazia";
		else
			return "existe itens no repositório";		
	}
	
	public String procurarItem(List<Item> itens, Item item){
		
		if(itens.contains(item))
			return "Item encontrado";
		else
			return "Item não encontrado";
	}

}
