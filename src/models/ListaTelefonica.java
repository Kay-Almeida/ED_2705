package models;

import java.util.Objects;

public class ListaTelefonica {
	
	public String numero;
	public String nome; 
	
	public String toString() {
		return nome + " (" + numero + ")";
	}
	

	@Override
	public int hashCode() {
		int num = Integer.parseInt(numero.substring(0, 2)); 
		int posicao = num - 11; 
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaTelefonica other = (ListaTelefonica) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
	}
	
	
	
}
