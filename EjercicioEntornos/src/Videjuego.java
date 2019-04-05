import java.io.*;
public class Videjuego {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	private String titulo;
	private double horas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	public void pedirDatos() throws IOException {
		do{
			System.out.println("Intruduzca el TITULO del videojuego:");
			titulo=leer.readLine().toLowerCase();
		}while(titulo.length()==0);
		do{
			System.out.println("Introduzca el número de HORAS ESTIMADAS del videojuego "+titulo+":");
			horas=Double.parseDouble(leer.readLine());
		}while(horas<=0||horas>10);
		char resp;
		do {
			System.out.println("Introduzca si ha sido ENTREGADO el videojuego "+titulo+":");
			resp=leer.readLine().toUpperCase().charAt(0);
		}while((resp!='S')&&(resp!='N'));
		if(resp=='S') {
			entregado=true;
		}else
			entregado=false;
		do {
			System.out.println("Introduzca el GENERO del videojuego "+titulo+":");
			genero=leer.readLine().toLowerCase();
		}while(genero.length()==0);
		do {
			System.out.println("Introduzca la COMPAÑÍA del videojuego "+titulo+":");
			compania=leer.readLine().toLowerCase();
		}while(compania.length()==0);
	}
	
	public void mostrarDatos() {
		String resp;
		if(entregado=true) {
			resp="sí";
		}else resp="no";
		System.out.println("El videojuego "+titulo+" tiene unas horas estimadas de "+ horas +"h. que "+resp+" ha sido entregado, de género "+genero+" y de la compañía "+compania+".");
	}
	Videjuego() {
		titulo = null;
		horas = 3;
		entregado = false;
		genero = null;
		compania = null;
	}
	Videjuego(String tit, String compa) {
		titulo = tit;
		horas = 3;
		entregado = false;
		genero = null;
		compania = compa;
	}
	Videjuego(String tit, int horases, String gen, String compa) {
		titulo = tit;
		horas = horases;
		entregado = false;
		genero = gen;
		compania = compa;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
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
	public boolean compareTo(Videjuego v) {
		return entregado;
		
	}
}
