package es.uom.miw.pd.Observer.Persona;

import upm.jbb.IO;

public final class MainObserver {
	private MainObserver() {
	}

	public static void main(String[] args) {
		Persona persona = new Persona("Martina Salazar", 22, 666666666);
		new ObservadorPersona(persona);

		persona.setNombre("Martina Salazar");
		persona.setEdad(23);
		persona.setMovil(661616161);
		// new Persona(sujeto);
		// IO.out.println("Leo sujeto... " + sujeto.getEstado());
		/*
		 * IO.out.println("Leo persona... " + persona.getNombre());
		 * IO.out.println("Cambio persona...");
		 * persona.setNombre("Martina Salazar"); persona.setEdad(23);
		 * persona.setMovil(661616161);
		 */
		IO.in.addModel(persona);
		IO.out.setStatusBar(persona.toString());
	}

}
