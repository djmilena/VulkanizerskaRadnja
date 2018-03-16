package gume;

/**
 * Klasa koja specifikuje gumu automobila.
 * 
 * @author Milena Djordjevic
 * 
 * @version 1.0
 */
public class AutoGuma {
	
	/**
	 * Model gume
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca vrednost atributa markaModel.
	 * @return model gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja novu vrednost atributa markaModel.
	 * 
	 * @param markaModel nova vrednost za model
	 * 
	 * @throws java.util.RuntimeException ako je unet
	 * <ul>
	 * 
	 * <li> null String </li>
	 * 
	 * <li> String duzine manje od 3 </li>
	 * 
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa precnik.
	 * @return precnik gume kao Integer
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost atributa precnik.
	 * 
	 * @param precnik nova vrednost za precnik
	 * 
	 * @throws java.util.RuntimeException ako je unet
	 * <ul>
	 * 
	 * <li> precnik manji od 13 </li>
	 * 
	 * <li> precnik veci od 22 </li>
	 * 
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina.
	 * @return sirina gume kao Integer
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost atributa sirina.
	 * 
	 * @param sirina nova vrednost za sirinu
	 * 
	 * @throws java.util.RuntimeException ako je uneta
	 * <ul>
	 * 
	 * <li> sirina manja od 135 </li>
	 * 
	 * <li> sirina veca od 355</li>
	 * 
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visina.
	 * @return visina gume kao Integer
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost atributa visina.
	 * 
	 * @param visina nova vrednost za visinu
	 * 
	 * @throws java.util.RuntimeException ako je uneta
	 * <ul>
	 * 
	 * <li> visina manja od 25 </li>
	 * 
	 * <li> visina veca od 95 </li>
	 * 
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * Vraca opis svih atribute klase. 
	 * @return vrednost atributa u obliku Stringa
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Vraca logicku vrednost izraza koji uporedjuje dva objekta klase AutoGuma. 
	 * @return true ako su dva objekta ove klase jednaka, u suprotnom false
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
