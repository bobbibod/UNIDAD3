class ArchivoV2 extends Archivo {
	private int noPaginasElemento;
	
	public ArchivoV2(String nombre,String extension,int noComp,int noPaginas, int noPaginasElemento) {
		super( nombre,extension, noComp,noPaginas);
		this.noPaginasElemento=noPaginasElemento;
	}

	public int getNoPaginasElemento() {
		return noPaginasElemento;
	}

	public void setNoPaginasElemento(int noPaginasElemento) {
		this.noPaginasElemento = noPaginasElemento;
	}
	public String toString() {
	return super.toString()+"  "+noPaginasElemento;
	}
	
}