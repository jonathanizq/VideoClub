
public class Principal {
	
	public static void instanciar(Serie[] s, Videjuego[] v) {
		int contS=0, contV=0;
		for(int i=0; i<5; i++) {
			s[i] = new Serie();
			s[i].pedirDatos();
			v[i] = new Videjuego();
			v[i].pedirDatos();
		}
		for(int j=0; j<5; j++) {
			System.out.println("SERIE "+(j+1)+": ");
			if(j%2==0) 
				s[j].entregar();
			else
				v[j].entregar();
			if(s[j].isEntregado())
				contS++;
			if(v[j].isEntregado())
				contV++;
			s[j].mostrarDatos();
			System.out.println("VIDEOJUEGO "+(j+1)+": ");
			v[j].mostrarDatos();
		}
		System.out.println("Hay un total de "+contS+" Series entregadas y "+contV+" Videojuegos entregados.");
	}
	public static void main(String[] args) {
		Serie [] s = new Serie[5];
		Videjuego [] v = new Videjuego[5];
		instanciar(s, v);
	}

}
