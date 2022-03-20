package java_vulkanizerskaRadnja.interfaces;

import java.util.List;
import java_vulkanizerskaRadnja.models.AutoGuma;

/**
 * Interfejs koji predstavlja radnju(prodavnicu)
 * 
 * @author Dule Djo
 * @version 0.1
 *
 */
public interface Radnja {
	/**
	 * Dodaje novu gumu u radnju.
	 * 
	 * @param a je auto guma koja se dodaje u radnju.
	 * @throws java.lang.NullPointerException ako je uneta auto guma tipa null.
	 * @throws java.lang.RuntimeException     ako auto guma vec postoji u radnji.
	 */
	void dodajGumu(AutoGuma a);

	/**
	 * Vraca listu auto guma za prosledjenu marku.
	 * 
	 * @param markaModel marka modela auto gume
	 * @return
	 *         <ul>
	 *         <li>null ako je uneta marka tipa null.</li>
	 *         <li>nova lista koja sadrzi sve gume zadate marke.</li>
	 *         </ul>
	 */
	List<AutoGuma> pronadjiGumu(String markaModel);

	/**
	 * Vraca listu svih guma
	 * 
	 * @return lista svih guma
	 */
	List<AutoGuma> vratiSveGume();
}