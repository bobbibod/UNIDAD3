class Persona{
	 private String nombre;
	 private int    edad,estatura;
	 public Persona(String nombre, int edad,int estatura) {
		 this.nombre=nombre;
		 this.edad=edad;
		 this.estatura=estatura;
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
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	 public String toString() {
		 return Rutinas.PonBlancos(nombre, 40)+Rutinas.PonCeros( edad,2);
	 }
}