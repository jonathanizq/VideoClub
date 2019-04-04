
public class Principal {
	
	public static void instanciar(Serie[] s, videojuego[] v) {
		for(int i=0; i<5; i++) {
			s[i] = new Serie();
			v[i] = new videojuego();
		}
	}
	public static void main(String[] args) {
		Serie [] s = new Serie[5];
		videojuego [] v = new videojuego[5];
		instanciar(s, v);
	}

}
