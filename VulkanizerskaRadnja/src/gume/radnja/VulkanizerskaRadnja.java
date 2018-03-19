package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja predstavlja vulkanizersku radnju.
 * @author Milena Djordjevic
 * @version 1.0
 */

public class VulkanizerskaRadnja {
	
	/**
	 * Lista objekata klase AutoGuma.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Dodaje gumu na pocetku liste.
	 * @param a klase AutoGuma
	 * 
	 * @throws java.lang.NullPointerException.class ukoliko je a = null.
	 * @throws java.lang.RuntimeException.class ukoliko lista vec sadrzi objekat a.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Vraca listu gume.
	 * @return gume kao listu objekata klase AutoGuma
	 */
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}
	
	/**
	 * Postavlja listu novu vrednost liste gume.
	 * @param gume lista objekata klase AutoGuma
	 */
	public void setGume(LinkedList<AutoGuma> gume) {
		
		this.gume = gume;
	}

	/**
	 * Pronalazi i vraca sve objekate sa zadatim modelom, u vidu nove liste.
	 * Ukoliko je parametar null metoda vraca null.
	 *  
	 * @param markaModel kao atribut klase AutoGuma
	 * 
	 * @return novaLista kao lista objekata klase AutoGuma
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
