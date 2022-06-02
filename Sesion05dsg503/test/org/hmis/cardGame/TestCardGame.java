package org.hmis.cardGame;

import org.junit.jupiter.api.Test;

public class TestCardGame {

	@Test
	void testGanar() {
		String[] parametros = {"test", "5", "perder"};
		Main.main(parametros);
	}

	@Test
	void testPerder() {
		String[] parametros = {"test", "5", "ganar"};
		Main.main(parametros);
	}

	@Test
	void testEmpatar() {
		String[] parametros = {"test", "5", "empate"};
		Main.main(parametros);
	}

	@Test
	void testDemasiadoDinero() {
		String[] parametros = {"test", "15", "empate"};
		Main.main(parametros);
	}

	@Test
	void testMenosCero() {
		String[] parametros = {"test", "-5", "empate"};
		Main.main(parametros);
	}

	@Test
	void testPerderTodoDinero() {
		String[] parametros = {"test", "10", "perder"};
		Main.main(parametros);
	}
}
