package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class menormayor_primoTest {

	@Test
	void testNumeroMayor() {
		menormayor_primo menormayor = new menormayor_primo();
		int [] esperado = {5,1};
		assertArrayEquals(esperado, menormayor.mayor(1, 3, 5));
	}

}
