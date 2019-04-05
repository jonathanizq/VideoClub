import java.io.*;
public class Serie implements Entregable{
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
	
	public void pedirDatos() throws IOException {
		char resp;
		do {
			System.out.println("TITULO: ");
			titulo = leer.readLine();
		} while(titulo.length()==0);
		do {
			System.out.println("NUMERO DE TEMPORADAS: ");
			numTemp = Integer.parseInt(leer.readLine());
		} while(numTemp<=0);
		do { 
			System.out.println("HA ENTREGADO LA PELICULA?");
			resp = leer.readLine().toUpperCase().charAt(0);
		} while(resp != 'S' && resp != 'N');
		if(resp=='S')
			entregado = true;
		else
			entregado = false;
		System.out.println("GENERO: ");
		genero = leer.readLine();
		System.out.println("CREADOR: ");
		creador = leer.readLine();
	}
	
	public void mostrarDatos() {
		String resp;
		System.out.println("TITULO: "+titulo);
		System.out.println("TEMPORADAS: "+numTemp);
		if(entregado==true)
			resp="SI";
		else
			resp="NO";
		System.out.println("ENTREGADO? "+resp);
		System.out.println("GENERO: "+genero);
		System.out.println("CREADOR: "+creador);
		
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
	/*public boolean compareTo(Serie s) {
		
	}*/
}
