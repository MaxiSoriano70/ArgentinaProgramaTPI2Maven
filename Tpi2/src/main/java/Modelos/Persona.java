package Modelos;

import lombok.Data;

@Data
public class Persona {
	private String dni;
	private String nombreCompleto;
	
	public Persona(String nombreCompleto, String dni) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
	}
}
