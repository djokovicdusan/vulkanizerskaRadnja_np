package java_vulkanizerskaRadnja.models;

/**
 * Domenska klasa koja predstavlja gumu za automobil
 * 
 * Automobilska guma ima svoje atribute marka modela, precnik,sirinu i visinu
 * 
 * @author Dule Djo
 * @version 0.1
 *
 */

public class AutoGuma {

	/**
	 * Marka modela kao String tip podataka
	 */
	private String markaModel = null;
	/**
	 * Precnik gume kao integer
	 */
	private int precnik = -1;
	/**
	 * Sirina gume kao integer
	 */
	private int sirina = -1;
	/**
	 * Visina gume kao integer
	 */
	private int visina = -1;

	/**
	 * Konstruktor koji inicijalizuje novi objekat klase AutoGuma
	 */

	public AutoGuma() {

	}

	/**
	 * Konstruktor koji inicijalizuje objekat klase AutoGuma i postavlja vrednosti
	 * za atribute marka modela, precnik, sirina i visina
	 * 
	 * @param markaModel Marka modela gume kao String
	 * @param precnik    Precnik gume kao integer
	 * @param sirina     Sirina gume kao integer
	 * @param visina     Visina gume kao integer
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	/**
	 * Vraca marku modela AutoGume
	 * 
	 * @return Marka modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja atribut marka modela na novu vrednost.
	 * 
	 * @param markaModel Marka modela kao String
	 * 
	 * @throws java.lang.NullPointerException ako je uneta marka modela gume null.
	 * @throws java.lang.RuntimeException     ako je uneta marka modela gume sa
	 *                                        manje od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length() < 3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik auto gume
	 * 
	 * @return Precnik kao integer
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja atribut precnik na novu vrednost.
	 * 
	 * @param precnik Precnik kao integer
	 *
	 * @throws java.lang.RuntimeException ako je uneti precnik manji od 13 ili veci
	 *                                    od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu AutoGume
	 * 
	 * @return Sirina kao integer
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja atribut sirina na novu vrednost.
	 * 
	 * @param sirina Sirina kao integer
	 *
	 * @throws java.lang.RuntimeException ako je uneta sirina manja od 135 ili veca
	 *                                    od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu auto gume
	 * 
	 * @return Visina kao integer
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja atribut visina na novu vrednost.
	 * 
	 * @param visina Visina kao integer
	 *
	 * @throws java.lang.RuntimeException ako je uneta visina manja od 25 ili veca
	 *                                    od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * @return Vraca String sa svim atributima klase
	 */

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi dve auto gume i vraca true ako su iste, a false ako nisu.
	 * 
	 * Autori se porede po marki modela, precniku, sirini i visini gume. Potrebno je
	 * da svi ovi atributi budu isti da bi i dva objekta ove klase bila ista.
	 * 
	 * @return
	 *         <ul>
	 *         <li>true ako su oba objekta klase AutoGuma i imaju iste marku modela,
	 *         precnik, sirinu i visinu.</li>
	 *         <li>false u svim ostalim slucajevima.</li>
	 *         </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
