package libs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class FuncionesTest {
	
	
	private static Funciones utils;



	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		utils = new Funciones();
		System.out.println("iniciando test");

	}

	@Test
	void testDevuelveCentral() {
		assertEquals(5, utils.devuelveCentral(1, 5, 8));
		assertEquals(5, utils.devuelveCentral(8, 5, 1));
		assertEquals(5, utils.devuelveCentral(5, 1, 8));
		assertEquals(5, utils.devuelveCentral(5, 5, 5));
		assertEquals(5, utils.devuelveCentral(1, 8, 5));

	}

	@Test
	void testMinutosEntre() {
		 assertEquals(130, utils.minutosEntre(12,20,14,30));

         assertEquals(130, utils.minutosEntre(14,30,12,20));

         assertEquals(1439, utils.minutosEntre(23,59,0,0));

         assertThrows(ArithmeticException.class,

                      () -> utils.minutosEntre(32,10,14,20));

         assertThrows(ArithmeticException.class,

                      () -> utils.minutosEntre(22,70,14,20));

         assertThrows(ArithmeticException.class,

                      () -> utils.minutosEntre(22,10,95,20));

         assertThrows(ArithmeticException.class,

                      () -> utils.minutosEntre(22,10,14,75));
         
         assertThrows(ArithmeticException.class,

                 () -> utils.minutosEntre(2,2,2,2));
         assertThrows(ArithmeticException.class,

                 () -> utils.minutosEntre(0,0,0,0));
         assertThrows(ArithmeticException.class,

                 () -> utils.minutosEntre(-22,70,14,20));

	}

	@Test
	void testEsCapicua() {
		int num [] = {3,5,6,5,3};
		int num2 [] = {3,8,6,5,3};

		assertTrue( utils.esCapicua(num));	
		assertFalse( utils.esCapicua(num2));
	}

	@Test
	void testSuma_vectores() {
		int num [] = {1,2,3};
		int num2 [] = {4,5,8};
		
		int resu [] = {5,7,11};
		assertArrayEquals(resu, utils.suma_vectores(num, num2));
		int num3 [] = {1,2,3,88,7};
		assertThrows(ArithmeticException.class, () -> utils.suma_vectores(num, num3));

		System.out.println("Test Finalizados");
	}
	

}
