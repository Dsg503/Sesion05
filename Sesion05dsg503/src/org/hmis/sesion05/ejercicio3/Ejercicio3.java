package org.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public void enmascarado(String contrasena) {
		if (contrasena.length() < 5) {
			System.out.print("password demasiado corto");
		}else if (contrasena.length() <= 8) {
			System.out.print("********");
		}else if (contrasena.length() <= 11) {
			System.out.print("********");
			for(int i = 8; i < contrasena.length(); i++) {
				System.out.print("*");
			}
		}else if (contrasena.length() <= 40) {
			System.out.print("************");
		}else {
			System.out.print("password demasiado largo");
		}
	}
}
