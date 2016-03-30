package br.unipe.mlpIII.Listas.ui;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import br.unipe.mlpIII.Listas.modelo.Inventorio;
import br.unipe.mlpIII.Listas.modelo.Item;

public class Teste {

	public static void main(String[] args) {
		
		Item item1 = new Item(1, "Item 2");
		item1.setCodigo(2);
		
		Item item2 = new Item(2, "Item 1");
		item2.setCodigo(1);
		
		Item item3 = new Item(3, "Item 4");
		item3.setCodigo(4);
		
		Item item4 = new Item(4, "Item 3");
		item4.setCodigo(3);
		
		//passar esse item caso quera ver se sera retornada a mensagem item não encontrado
		Item item5 = new Item(5, "Item 5");
		
		List<Item> itens = new ArrayList<>();
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		
		System.out.println("Itens desordenados: " +itens);
		
		Collections.sort(itens);
		
		System.out.println("Itens ordenados: " +itens);
		System.out.println();
		
		Inventorio inventorio = new Inventorio();
		
		String verificar = inventorio.colecaoVazia(itens);
		System.out.println(verificar);
		
		String procurar = inventorio.procurarItem(itens, item3);
		System.out.println(procurar);


	}

}
