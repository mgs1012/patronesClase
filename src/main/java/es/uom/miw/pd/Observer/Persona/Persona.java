package es.uom.miw.pd.Observer.Persona;

public class Persona  extends ObservablePersona{
	
	private String nombre;
	
	private int edad;
	
	private long movil;
	


	public Persona(String nombre, int edad, long movil){
		this.nombre = nombre;
		this.edad = edad;
		this.movil = movil;
	}
	
	public String toString(){
		return "Nombre: " + this.getNombre() + "\nEdad :" + this.getEdad() + "\nMovil :" + this.getMovil();
		
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public long getMovil() {
		return movil;
	}



	public void setMovil(long movil) {
		this.movil = movil;
	}
	
	

}
