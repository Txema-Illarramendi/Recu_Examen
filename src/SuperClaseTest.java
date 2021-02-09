
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class SuperClaseTest {

	int[] lista={5,9,71,3,6,45,15,53,90,20};
	int[] lista2={1,9,65,4,28,7,33,23,10,4,11,26,42,93,44};
	double flotante=350.364249;
	static SuperClase sc;

	@BeforeAll
	static void antesDeTodosLosTest() {
		sc = new SuperClase();
	}

	@BeforeEach
	void antesDeCadatest() {
		sc.tcount++;
	}

	@Test
	@DisplayName("#1 Media de valores de un arreglo")
	void test01() {
		double result = sc.media(lista);
		assertEquals(31.2, result);
	}

	@Test
	@DisplayName("#2 Media de valores de un arreglo (segundo test)")
	void test02() {
		double result = sc.media(lista2);
		assertEquals(26.6, result);
	}

	@Test
	@DisplayName("#3 restringe a dos decimales")
	void test03() {
		double result = sc.dosDecimales(flotante);
		assertEquals(350.36, result);
	}

	@Test
	@DisplayName("#4 elimina caracteres repetidos en un String")
	void test04() {
		String result = sc.QuitaDuplicados("Puuueeerttta");
		assertEquals("Puerta", result);
	}

	@Test
	@DisplayName("#5 elimina caracteres repetidos en un String")
	void test05() {
		String result = sc.QuitaDuplicados("Deesspaaaaachhhooo");
		assertEquals("Despacho", result);
	}

	@Test
	@DisplayName("#6 elimina caracteres repetidos en un String")
	void test06() {
		int result = sc.suma(5,6);
		assertEquals(11, result);
	}

	@AfterEach
	void trasCadaTest() {
		System.out.println("test ejecutados hasta ahora: " + sc.tcount);
	}

	@AfterAll
	static void trasTodosLosTest() {
		System.out.println("test ejecutados totales: " + sc.tcount);
		System.out.println("metodos invocados: " + sc.mcount);
		System.out.println("instanciaciones totales: " + sc.icount);
	}

}
