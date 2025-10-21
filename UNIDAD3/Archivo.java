public class Archivo {
	private String nombre,extension;
	private int    noComp, noPaginas;
	
	public Archivo(String nombre,String extension,int noComp,int noPaginas) {
		this.nombre=nombre;
		this.extension=extension;
		this.noComp=noComp;
		this.noPaginas=noPaginas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getNoComp() {
		return noComp;
	}

	public void setNoComp(int noComp) {
		this.noComp = noComp;
	}

	public int getNoPaginas() {
		return noPaginas;
	}

	public void setNoPaginas(int noPaginas) {
		this.noPaginas = noPaginas;
	}
	public String toString() {
		return nombre+"."+extension+"  "+noComp+"  "+noPaginas;
	}
 
}
