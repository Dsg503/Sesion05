package org.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestEjercicio5 {

	@ParameterizedTest
	@CsvFileSource(resources = "../../../../lista.csv", numLinesToSkip = 1, delimiter = ';')
	void testA2Vacia(String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j) {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add(a);
		nombres.add(b);
		nombres.add(c);
		nombres.add(d);
		nombres.add(e);
		nombres.add(f);
		nombres.add(g);
		nombres.add(h);
		nombres.add(i);
		nombres.add(j);
		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(nombres, new ArrayList<String>());
		// Assert
		assertEquals(nombres, ordenada);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "../../../../lista.csv", numLinesToSkip = 1, delimiter = ';')
	void testA2Null(String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j) {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add(a);
		nombres.add(b);
		nombres.add(c);
		nombres.add(d);
		nombres.add(e);
		nombres.add(f);
		nombres.add(g);
		nombres.add(h);
		nombres.add(i);
		nombres.add(j);
		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(nombres, null);
		// Assert
		assertEquals(nombres, ordenada);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "../../../../lista.csv", numLinesToSkip = 1, delimiter = ';')
	void testA1Vacia(String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j) {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add(a);
		nombres.add(b);
		nombres.add(c);
		nombres.add(d);
		nombres.add(e);
		nombres.add(f);
		nombres.add(g);
		nombres.add(h);
		nombres.add(i);
		nombres.add(j);
		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(new ArrayList<String>(), nombres);
		// Assert
		assertEquals(nombres, ordenada);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "../../../../lista.csv", numLinesToSkip = 1, delimiter = ';')
	void testA1Null(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add(a);
		nombres.add(b);
		nombres.add(c);
		nombres.add(d);
		nombres.add(e);
		nombres.add(f);
		nombres.add(g);
		nombres.add(h);
		nombres.add(i);
		nombres.add(j);
		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(null, nombres);
		// Assert
		assertEquals(nombres, ordenada);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "../../../../listas.csv", numLinesToSkip = 1, delimiter = ';')
	void testA1A2(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j,
			String k, String l, String m, String n, String o, String p, String q, String r, String s, String t) {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		ArrayList<String> nombresA1 = new ArrayList<String>();
		ArrayList<String> nombresA2 = new ArrayList<String>();
		nombresA1.add(a);
		nombresA1.add(b);
		nombresA1.add(c);
		nombresA1.add(d);
		nombresA1.add(e);
		nombresA1.add(f);
		nombresA1.add(g);
		nombresA1.add(h);
		nombresA1.add(i);
		nombresA1.add(j);
		nombresA2.add(k);
		nombresA2.add(l);
		nombresA2.add(m);
		nombresA2.add(n);
		nombresA2.add(o);
		nombresA2.add(p);
		nombresA2.add(q);
		nombresA2.add(r);
		nombresA2.add(s);
		nombresA2.add(t);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add(l);
		expected.add(n);
		expected.add(f);
		expected.add(e);
		expected.add(k);
		expected.add(o);
		expected.add(g);
		expected.add(i);
		expected.add(t);
		expected.add(q);
		expected.add(r);
		expected.add(m);
		expected.add(h);
		expected.add(b);
		expected.add(j);
		expected.add(p);
		expected.add(d);

		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(nombresA1, nombresA2);
		// Assert
		assertEquals(expected, ordenada);
	}

	@Test
	void testA1A2Vacias() {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(new ArrayList<String>(), new ArrayList<String>());
		// Assert
		assertEquals(new ArrayList<String>(), ordenada);
	}

	@Test
	void testA1A2Null() {
		// Arrange
		Ejercicio5 e5 = new Ejercicio5();
		// Act
		ArrayList<String> ordenada = e5.listaOrdenadaEstudiantes(null, null);
		// Assert
		assertEquals(new ArrayList<String>(), ordenada);
	}
}
