package br.unipe.mlpIII.Listas.modelo;

import java.util.List;

public class Inventorio{
	
	public String colecaoVazia(List<Item> item){
		
		if(item.isEmpty())
			return "cole��o vazia";
		else
			return "existe itens no reposit�rio";		
	}
	
	public String procurarItem(List<Item> itens, Item item){
		
		if(itens.contains(item))
			return "Item encontrado";
		else
			return "Item n�o encontrado";
	}

}
