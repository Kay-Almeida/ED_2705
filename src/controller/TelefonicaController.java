package controller;

import model.Lista;
import models.ListaTelefonica;

public class TelefonicaController {
	
	Lista [] tabelaTelefone; 
	
	public TelefonicaController () {
		tabelaTelefone = new Lista[89]; 
		inicializarLista(); 
	}
	
	public void inicializarLista() {
		int tamanho = tabelaTelefone.length; 
		for(int i=0; i<tamanho; i++) {
			tabelaTelefone[i]= new Lista(); 
		}
	}
	
	public void adicionarNumero(ListaTelefonica LT) {
		int posicao = LT.hashCode(); 
		tabelaTelefone[posicao].addFirst(LT);
	}
	
	public void listarNumeros() throws Exception {
		int tamanho = tabelaTelefone.length; 
		for(int i=0; i<tamanho; i++) {
			int tamanho2 = tabelaTelefone[i].size(); 
			for(int j=0; j<tamanho2; j++) {
				ListaTelefonica LTA = (ListaTelefonica) tabelaTelefone[i].get(j); 
				System.out.println(LTA.toString());
			}
		}
		
	}
	
	
}
