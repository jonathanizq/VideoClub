
public class Principal {
	
	public static void instanciar(Serie[] s, Videjuego[] v) {
		for(int i=0; i<5; i++) {
			s[i] = new Serie();
			s[i].pedirDatos();
			v[i] = new Videjuego();
			v[i].pedirDatos();
		}
		for(int j=0; j<5; j++) {
			System.out.println("SERIE "+(j+1)+": ");
			s[j].mostrarDatos();
			System.out.println("VIDEOJUEGO "+(j+1)+": ");
			v[j].mostrarDatos();
		}
	}
	public static void main(String[] args) {
		Serie [] s = new Serie[5];
		Videjuego [] v = new Videjuego[5];
		instanciar(s, v);
	}

}
