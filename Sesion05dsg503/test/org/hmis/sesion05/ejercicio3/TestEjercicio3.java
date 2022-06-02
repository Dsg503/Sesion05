package org.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio3 {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"as, password demasiado corto"})
	void testMenor5(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"aaaaaa1, ********"})
	void testMayor5(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"2aaaaaaaa, *********"})
	void test9Caracteres(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"11aaaaaaaaa, ***********"})
	void test11Caracteres(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"aaaaaaaaaaaaaaaaaa, ************"})
	void testMayor12(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, password demasiado largo"})
	void testMayor40(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"aaaaaaaa, ********"})
	void test8(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"aaaaaaaaaaaa, ************"})
	void test12(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}

	@ParameterizedTest(name = "{index} => Contraseña {0} devuelve {1}")
	@CsvSource({"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, ************"})
	void test40(String pass, String expected) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
        ByteArrayOutputStream consola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consola));
		e3.enmascarado(pass);
		// Assert
		assertEquals(expected, consola.toString());
	}
}
