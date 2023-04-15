package Modelos;

import lombok.Data;

@Data
public class Equipo {
	private String nombre;

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}
}
