package es.uom.miw.pd.Observer.Persona;

public class ObservadorPersona {
	
	private Persona persona;

    public ObservadorPersona(Persona persona) {
		this.persona = persona; 
		this.persona.aniadir(this);
	}

	void actualizar() {
		System.out.println("Cambio persona\n" + this.persona.toString());
	}
}
