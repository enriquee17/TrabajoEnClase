package Entornos;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class menormayorTestSuite {

	@Test
	public void testMayor() {
		menormayor_primo menormayor = new menormayor_primo();
		int [] esperado = {5,1};
		assertArrayEquals(esperado, menormayor.mayor(1, 3, 5));
	}

}
