package riccardogulin.u5d3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5d3ApplicationTests {


	@Test
	void testSum(){
		System.out.println("TEST 1");
		int result = CustomMath.sum(2,2);
		int result1 = CustomMath.sum(3,3);

		assertEquals(4, result);
		assertEquals(6, result1);
	}

	@ParameterizedTest
	@CsvSource({"1,1,2", "2,2,4", "5,5,10", "10,10,20"})
	void testParameterizedSum(int add1, int add2, int expectedResult){
		int result = CustomMath.sum(add1,add2);
		assertEquals(expectedResult, result);
	}

	@Test
	void testArraySum(){
		System.out.println("TEST 2");
		int result = CustomMath.sum(new int[]{1,2,3});
		assertEquals(6, result);
	}

	@BeforeAll
	static void beforeAll(){
		System.out.println("BEFOREALL");
		// Utile come 'setup iniziale' per i test, ci consente ad esempio di riempire il db con dati utili per il testing
	}

	@AfterAll
	static void afterAll(){
		System.out.println("AFTERALL");
		// Utile per 'ripulire la situazione', ad esempio ripristinare il db ad uno stato iniziale dopo che i vari test l'hanno 'sporcato'
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("BEFOREEACH");
	}

	@AfterEach
	void afterEach(){
		System.out.println("AFTEREACH");
	}
}
