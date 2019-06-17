package model;

public class Editore {

	private int editoreId;
	private String nome;

	public Editore(int editoreId, String nome) {
		this.editoreId = editoreId;
		this.nome = nome;
	}

	public int getEditoreId() {
		return editoreId;
	}

	public void setEditoreId(int editoreId) {
		this.editoreId = editoreId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Editore [editoreId=" + editoreId + ", nome=" + nome + "]";
	}
	
	
	
	
}
