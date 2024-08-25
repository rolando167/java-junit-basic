package com.pruebas.spring.unit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void sumarTest() {
        // given
        int numero1 = 4;
        int numero2 = 6;

        // when
        int result = example.sumar(numero1, numero2);

        // then
        assertNotNull(result);
        assertEquals(10, result); // valor esperado, valor actual
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo() {
        // Given - Teniendo
        int number = 4;

        // When - Cuando
        boolean result = example.checkPositivo(number);

        // Then - Entonces
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        // Given
        int number = -4;

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void testContarLetrasA() {
        // Given
        String cadena = "unprogramadornace";

        // When
        int result = example.contarLetrasA(cadena);

        // Then
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    public void testContieneElemento() {
        // Given
        List<String> countries = List.of("Colombia", "Mexico", "Chile");
        String country = "Colombia";

        // When
        boolean result = this.example.contieneElemento(countries, country);

        // Then
        assertTrue(result);
        assertEquals(3, countries.size());
        assertEquals("Colombia", countries.get(0).toString());
    }

    @Test
    public void ArrayLisExample1Test() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.set(1, 1000);
        assertEquals(list.get(1), 1000);
    }

    @Test
    public void ArrayLisExample2Test() {
        // When
        List<Player> result = Arrays.asList(
                new Player(1L, "Lionel Messi", "Inter Miami", "Delantero"),
                new Player(2L, "Cristiano Ronaldo", "Al Nassr", "Delantero"),
                new Player(3L, "Neymar Jr.", "Paris Saint-Germain", "Delantero"),
                new Player(4L, "Kylian Mbappé", "Paris Saint-Germain", "Delantero"),
                new Player(5L, "Kevin De Bruyne", "Manchester City", "Volante"),
                new Player(6L, "Virgil van Dijk", "Liverpool", "Defensa"));

        // Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("Lionel Messi", result.get(0).getName());
        assertEquals("Inter Miami", result.get(0).getTeam());
        assertEquals("Delantero", result.get(0).getPosition());
        // verify(this.playerRepository).findAll();
    }

    @Test
    public void testRevertirCadena() {
        // Given
        String cadena = "carro"; // orrac

        // When
        String result = this.example.revertirCadena(cadena);

        // Then
        assertEquals("orrac", result);
    }

    @Test
    public void testFactorial() {
        // Given
        int number = 6;

        // When
        long result = this.example.factorial(number);

        // Then
        assertEquals(720, result);
    }

    @Test
    public void testFactorialError() {
        // Given
        int number = -6;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });
    }

    @Test
    public void testEsPrimo() {
        // Given
        int number = 3;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMayorACuatro() {
        // Given
        int number = 7;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMenorQueUno() {
        // Given
        int number = 1;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimo() {
        // Given
        int number = 9;

        // When
        boolean result = this.example.esPrimo(number);

        // Then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // When
        String result = this.example.mensajeConRetraso();

        // Then
        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertirAString() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<String> result = this.example.convertirAString(numbers);

        // Then
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
    }

    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3);

        // When
        double result = this.example.calcularMedia(numbers);

        // Then
        assertEquals(2, result);
    }

    @Test
    public void testCalcularMediaNull() {
        // Given
        List<Integer> numbers = null;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void testCalcularMediaEmpty() {
        // Given
        List<Integer> numbers = Collections.emptyList();

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

}
