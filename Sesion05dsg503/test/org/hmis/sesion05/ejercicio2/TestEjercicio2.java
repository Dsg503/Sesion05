package org.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio2 {

	@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"Dsg503, PassworD123, true"})

	void testCorrecto(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}

	@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"Dsg503, password, false"})
	void testContrasenaNoValida(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}

	@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"---------31Caracteres---------, PassworD123, false",
				"Dsg503, ---------31Caracteres---------, false"})

	void testLongitud(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}

	@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"'', ds1, false", "ds1, '', false"})

	void testVacio(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}

	@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"usuario, PassworD123, false"})

	void testUsuarioMal(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}

	@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"Dsg503, password1A, false"})

	void testContrasenaMal(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}

	/*@ParameterizedTest(name = "{index} => Usuario {0} y contrase�a {1} da {2}")
	@CsvSource({"user, pAsSwOrD1234, true", "user, pass, false","'', antonio, false", "antonio, '', false",
		"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, pAsSwOrD1234, false", "user, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false",
		"user, password1A, false", "usuario, pAsSwOrD1234, false"})

	void testCompleto(String user, String password, boolean expected) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		boolean resultado = e2.login(user, password);
		// Assert
		assertEquals(expected, resultado);
	}*/
}
