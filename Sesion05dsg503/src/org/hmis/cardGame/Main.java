package org.hmis.cardGame;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Deck baraja = new Deck();
		int dinero = 10;
		int dineroApostado;
		Card cartaJugador;
		Card cartaBanca;
		boolean test = false;
		int tipoJuego = 0;
		if (args != null && args.length > 0 && args[0].equalsIgnoreCase("test")) {
			test = true;
			switch(args[2]) {
			case "ganar":
				tipoJuego = 1;
				break;
			case "perder":
				tipoJuego = -1;
				break;
			case "empate":
				tipoJuego = 0;
				break;
			}
		}
		System.out.println("---------------------------");
		System.out.println("-----LA CARTA MÁS ALTA-----");
		System.out.println("---------------------------");
		System.out.println("Dinero inicial: " + dinero + "€");
		Scanner escaner = new Scanner(System.in);
		while(dinero > 0) {
			dineroApostado = Integer.MAX_VALUE;
			while (dineroApostado > dinero) {
				System.out.println("¿Cuánto dinero desea apostar? (0 o menos para terminar la partida)");
				if (test) {
					dineroApostado = Integer.parseInt(args[1]);
				}else {
					dineroApostado = escaner.nextInt();
				}
				if (dineroApostado > dinero) {
					System.out.println("No puede apostar más dinero del que tiene");
					if (test) {
						break;
					}
				}
			}
			if (dineroApostado <= 0) {
				break;
			}
			baraja.shuffle();
			if (!test) {
				cartaJugador = baraja.dealCard();
				cartaBanca = baraja.dealCard();
			}else {
				switch(tipoJuego) {
				case 1:
					cartaJugador = new Card(1, 1);
					cartaBanca = new Card(2, 1);
					break;
				case -1:
					cartaJugador = new Card(2, 1);
					cartaBanca = new Card(1, 1);
					break;
				default:
					cartaJugador = new Card(1, 1);
					cartaBanca = new Card(1, 1);
					break;
				}
			}
			System.out.println("Tu carta: " + cartaJugador.getValueAsString() + cartaJugador.getSuitAsString());
			System.out.println("Carta de la banca: " + cartaBanca.getValueAsString() + cartaBanca.getSuitAsString());
			switch(Integer.compare(cartaJugador.getValue() == 1 ? 14 : cartaJugador.getValue(), cartaBanca.getValue() == 1 ? 14 : cartaBanca.getValue())) {
			case 1:
				System.out.println("Ha ganado la mano: + " + dineroApostado + "€");
				dinero += dineroApostado;
				break;
			case 0:
				System.out.println("Ha empatado: + 0€");
				break;
			case -1:
				System.out.println("Ha perdido la mano: - " + dineroApostado + "€");
				dinero -= dineroApostado;
				break;
			}
			System.out.println("");
			System.out.println("Dinero total: " + dinero + "€");
			if (test) {
				break;
			}
		}
		if (dinero == 0) {
			System.out.println("Ha acabado la partida. Ha perdido todo el dinero");
		}else {
			System.out.println("Ha acabado la partida. Termina con " + dinero + "€");
		}
		if (!test) {
			escaner.close();
		}
	}
}
