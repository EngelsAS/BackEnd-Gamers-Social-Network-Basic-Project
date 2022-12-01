package projeto;

import java.util.Objects;

public class Jogos {
	
	private int ID;
	private String nome;
	private double valor;
	
	public Jogos() {
		
		nome="--";
		ID = nome.hashCode();
		valor=00;
	}
	
	public Jogos(String nome,double valor) {
		
		this.nome = nome;
		this.ID = nome.hashCode();
		this.valor = valor;
		
	}

	public int getID() {
		return nome.hashCode();
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, nome, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogos other = (Jogos) obj;
		if(ID == other.ID || Objects.equals(nome, other.nome)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "[ID= " + ID + ", nome= " + nome + ", valor= " + valor + "]";
	}
	
}
