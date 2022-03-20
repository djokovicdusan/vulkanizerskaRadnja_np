package java_vulkanizerskaRadnja.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java_vulkanizerskaRadnja.models.AutoGuma;

class RadnjaTest {

	protected Radnja r;

	@Test
	void testDodajGumu() {
		AutoGuma ag = new AutoGuma();
		ag.setMarkaModel("Michelin");

		r.dodajGumu(ag);
		assertEquals(ag, r.pronadjiGumu(ag.getMarkaModel()).get(0));

	}

	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class, () -> r.dodajGumu(null));
	}

	@Test
	void testDodajGumuIsteGume() {

		AutoGuma ag1 = new AutoGuma("Tigar", 20, 210, 50);
		AutoGuma ag2 = new AutoGuma("Tigar", 20, 210, 50);

		r.dodajGumu(ag1);
		RuntimeException e = assertThrows(java.lang.RuntimeException.class, () -> r.dodajGumu(ag2));

	}

	@Test
	void testPronadjiGumu() {
		AutoGuma ag1 = new AutoGuma("Tigar", 20, 210, 50);
		AutoGuma ag2 = new AutoGuma("Michelin", 20, 210, 50);

		r.dodajGumu(ag1);
		r.dodajGumu(ag2);

		assertEquals(1, r.pronadjiGumu("Tigar").size());
		assertTrue(r.pronadjiGumu("Tigar").contains(ag1));
		assertTrue(!r.pronadjiGumu("Tigar").contains(ag2));
	}
	@Test
	void testPronadjiGumuDveGumeRazlicitihDimenzija() {
		AutoGuma ag1 = new AutoGuma("Tigar", 20, 210, 50);
		AutoGuma ag2 = new AutoGuma("Tigar", 19, 210, 50);
		
		r.dodajGumu(ag1);
		r.dodajGumu(ag2);
		
		assertEquals(2, r.pronadjiGumu("Tigar").size());
		assertTrue(r.pronadjiGumu("Tigar").contains(ag1));
		assertTrue(r.pronadjiGumu("Tigar").contains(ag2));
	}
	@Test
	void testPronadjiGumuNePostojiMarka() {
		AutoGuma ag1 = new AutoGuma("Tigar", 20, 210, 50);
		AutoGuma ag2 = new AutoGuma("Michelin", 20, 210, 50);
		
		r.dodajGumu(ag1);
		r.dodajGumu(ag2);
		
		assertEquals(0, r.pronadjiGumu("LingLong").size());
		assertTrue(!r.pronadjiGumu("LingLong").contains(ag1));
		assertTrue(!r.pronadjiGumu("LingLong").contains(ag2));
	}

	@Test
	void testPronadjiGumuNull() {
		assertEquals(r.pronadjiGumu(null), null);
	}

	@Test
	void testVratiSveGume() {
		AutoGuma ag1 = new AutoGuma("Tigar", 20, 210, 50);

		r.dodajGumu(ag1);
		assertEquals(1, r.vratiSveGume().size());
		assertTrue(r.vratiSveGume().contains(ag1));
	}

}
