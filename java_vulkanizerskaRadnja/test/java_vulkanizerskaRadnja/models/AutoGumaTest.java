/**
 * 
 */
package java_vulkanizerskaRadnja.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/** Klasa koja sadrzi junit testove za klasu AutoGuma
 * @author Dule Djo
 *
 */
class AutoGumaTest {
	AutoGuma ag;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		ag = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		ag = null;
	}

	/**
	 * Test method for {@link java_vulkanizerskaRadnja.models.AutoGuma#AutoGuma()}.
	 */
	@Test
	void testAutoGuma() {
		ag = new AutoGuma();
		assertNotNull(ag);
	}

	/**
	 * Test method for
	 * {@link java_vulkanizerskaRadnja.models.AutoGuma#AutoGuma(java.lang.String, int, int, int)}.
	 */
	@Test
	void testAutoGumaStringIntIntInt() {
		ag = new AutoGuma("Tigar", 15, 245, 45);
		assertNotNull(ag);
		assertEquals("Tigar", ag.getMarkaModel());
		assertEquals(15, ag.getPrecnik());
		assertEquals(245, ag.getSirina());
		assertEquals(45, ag.getVisina());

	}

	/**
	 * Test method for
	 * {@link java_vulkanizerskaRadnja.models.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	void testSetMarkaModel() {
		ag.setMarkaModel("Michelin");
		assertEquals("Michelin", ag.getMarkaModel());
	}

	@Test
	void testSetMarkaModelNull() {
		assertThrows(java.lang.NullPointerException.class, () -> ag.setMarkaModel(null));
	}

	@Test
	void testSetMarkaModelKratakString() {

		assertThrows(java.lang.RuntimeException.class, () -> ag.setMarkaModel("du"));
	}

	/**
	 * Test method for
	 * {@link java_vulkanizerskaRadnja.models.AutoGuma#setPrecnik(int)}.
	 */

	@Test
	void testSetPrecnik() {
		ag.setPrecnik(17);
		assertEquals(17, ag.getPrecnik());
	}

	@ParameterizedTest
	@CsvSource({ "0","24","25","1234" })
	void testSetPrecnikOpseg(int precnik) {
		assertThrows(java.lang.RuntimeException.class, () -> ag.setPrecnik(precnik));
	
	}

	/**
	 * Test method for
	 * {@link java_vulkanizerskaRadnja.models.AutoGuma#setSirina(int)}.
	 */
	@Test
	void testSetSirina() {
		ag.setSirina(200);
		assertEquals(200, ag.getSirina());
	}

	@ParameterizedTest
	@CsvSource({ "100","700","500" })
	void testSetSirinaOpseg(int sirina) {
		assertThrows(java.lang.RuntimeException.class, () -> ag.setSirina(sirina));
	
	}

	@Test
	void testSetVisina() {
		ag.setVisina(50);
		assertEquals(50, ag.getVisina());
	}

	@ParameterizedTest
	@CsvSource({ "100","450","1000","400" })
	void testSetVisinaOpseg(int visina) {
		assertThrows(java.lang.RuntimeException.class, () -> ag.setVisina(visina));
		
	}

	@Test
	void testToString() {
		ag.setMarkaModel("Tigar");
		ag.setPrecnik(20);
		ag.setSirina(190);
		ag.setVisina(60);
		String str = ag.toString();
		assertTrue(str.contains("Tigar"));
		assertTrue(str.contains("20"));
		assertTrue(str.contains("190"));
		assertTrue(str.contains("60"));
	}

	/**
	 * Test method for
	 * {@link java_vulkanizerskaRadnja.models.AutoGuma#equals(java.lang.Object)}.
	 */
	@ParameterizedTest
	@CsvSource({ "Michelin,Michyca,20,20,180,180,50,50,false", "Michelin,Michelin,20,21,180,180,50,50,false",
			"Michelin,Michelin,20,20,202,180,50,50,false", "Michelin,Michelin,20,20,180,180,51,50,false",
			"Michelin,Michelin,20,20,180,180,50,50,true" })
	void testEqualsObject(String marka1, String marka2, int p1, int p2, int s1, int s2, int v1, int v2, boolean equal) {
		ag.setMarkaModel(marka1);
		ag.setPrecnik(p1);
		ag.setSirina(s1);
		ag.setVisina(v1);

		AutoGuma b = new AutoGuma();
		b.setMarkaModel(marka2);
		b.setPrecnik(p2);
		b.setSirina(s2);
		b.setVisina(v2);
		assertEquals(equal, ag.equals(b));
	}

}
