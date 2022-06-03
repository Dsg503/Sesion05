package adsa;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio3 {

    @ParameterizedTest
    @CsvSource({"1,Lunes"})
    void testLunes(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }

    @ParameterizedTest
    @CsvSource({"2,Martes"})
    void testMartes(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
    @ParameterizedTest
    @CsvSource({"3,Miercoles"})
    void testMiercoles(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
    @ParameterizedTest
    @CsvSource({"4,Jueves"})
    void testJueves(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
    @ParameterizedTest
    @CsvSource({"5,Viernes"})
    void testViernes(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
    @ParameterizedTest
    @CsvSource({"6,Sabado"})
    void testSabado(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
    @ParameterizedTest
    @CsvSource({"7,Domingo"})
    void testDomingo(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
    @ParameterizedTest
    @CsvSource({"8,ERROR","0,ERROR"})
    void testSError(int dia, String expected) {
        //Arrange
        Ejercicio3 e3 = new Ejercicio3();
        //Act
        e3.diaSemana(dia);
        //Assert
        assertEquals(expected,e3.diaSemana(dia));
    }
}
