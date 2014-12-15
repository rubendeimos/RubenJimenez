package controlador;

import modelo.Dado;


public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dado jugador1dado1=new Dado();
		Dado jugador1dado2=new Dado();
		Dado jugador2dado1=new Dado();
		Dado jugador2dado2=new Dado();
		Dado test=new Dado();
		
		jugador1dado1.lanzarDado();
		jugador1dado2.lanzarDado();
		jugador2dado1.lanzarDado();
		jugador2dado2.lanzarDado();
		
		System.out.println("Tirada jugador1: ("+jugador1dado1.getCara()+","+jugador1dado2.getCara()+")");
		System.out.println("Tirada jugador2: ("+jugador2dado1.getCara()+","+jugador2dado2.getCara()+")");
		int sumadadosjugador1=jugador1dado1.getCara()+jugador1dado2.getCara();
		int sumadadosjugador2=jugador2dado1.getCara()+jugador2dado2.getCara();
		if(sumadadosjugador1>sumadadosjugador2)
			System.out.println("Gana jugador 1");
		else if(sumadadosjugador2>sumadadosjugador1)
			System.out.println("Gana jugador 2");
		if(sumadadosjugador1==sumadadosjugador2)
			System.out.println("Empate");
		
		System.out.println("Test de lanzamiento con 20 lanzamientos");
		test.realizarTest(20);
		test.print();

	}

}
