import java.io.*;
public class Serie {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	private String titulo;
	private int numTemp;
	private boolean entregado;
	private String genero;
	private String creador;
	
	Serie() {
		titulo = null;
		numTemp = 3;
		entregado = false;
		genero = null;
		creador = null;
	}
	Serie(String tit, String cread) {
		titulo = tit;
		numTemp = 3;
		entregado = false;
		genero = null;
		creador = cread;
	}
	Serie(String tit, int temp, String gen, String cread) {
		titulo = tit;
		numTemp = temp;
		entregado = false;
		genero = gen;
		creador = cread;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemp() {
		return numTemp;
	}
	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public void entregar() {
		entregado = true;
	}
	public void devolver() {
		entregado = false;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public boolean compareTo(Serie s) {
		
	}
}
