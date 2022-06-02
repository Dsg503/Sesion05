package org.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login(String username, String password) {
		if (username.isEmpty() || 
			password.isEmpty() || 
			username.length() >= 30 || 
			password.length() >= 30 || 
			!password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*$")) {
			return false;
		}else {
			return compruebaLoginEnBD(username, password);
		}
	}

	public boolean compruebaLoginEnBD(String username, String password) {
		if (username.equals("Dsg503") && password.equals("PassworD123"))
			return true;
		else
			return false;
	}
}