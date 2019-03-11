package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primoTestSuite {

	@Test
	void testPrimos() {
		menormayor_primo primo = new menormayor_primo();
		int [] esperado = {49, 47, 43};
		assertArrayEquals(esperado, primo.primos(50));
	}

}
