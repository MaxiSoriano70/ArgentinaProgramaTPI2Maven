package Modelos;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Ronda {
	private int numero;
	private ArrayList<Partido> partidos = new ArrayList<Partido>();
	
	
	public Ronda(int numero) {
		super();
		this.numero = numero;
	}
	
	public void mostrar_Resultados() {
		ArrayList<Partido> partidos = this.getPartidos();
		for(int i=0;i<partidos.size();i++) {
			System.out.println(partidos.get(i).getLocal().getNombre()+" vs "+partidos.get(i).getVisitante().getNombre()+" Ganador: "+partidos.get(i).getResultado());
		}
	}
}
