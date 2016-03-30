package br.unipe.mlpIII.Listas.modelo;

public class Item implements Comparable<Item>{
	
	protected int codigo;
	protected String descricao;
	
	public Item(int codigo, String descricao){
		
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int compareTo(Item outroItem){
		
		if(this.codigo < outroItem.codigo){
			return -1;
		}
		
		if(this.codigo > outroItem.codigo){
			return 1;
		}
		
		return 0;		
	}
	
	public String toString(){
		return this.descricao;
	}
	

}
