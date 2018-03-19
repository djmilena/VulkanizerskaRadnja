/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Mica
 *
 */
public class AutoGumaTest {

	private AutoGuma a;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		
		a.setMarkaModel("Trayal");
		
		assertEquals("Trayal", a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModel3() {
		
		a.setMarkaModel("tr");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(14);
		
		assertEquals(14, a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnik13() {
		a.setPrecnik(12);
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnik22() {
		a.setPrecnik(23);
		
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		a.setSirina(167);
		
		assertEquals(167, a.getSirina());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirina135() {
		a.setSirina(134);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirina355() {
		a.setSirina(356);
	}
	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		a.setVisina(87);
		
		assertEquals(87, a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisina25() {
		a.setVisina(24);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisina95() {
		a.setVisina(96);
	}
	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		a.setMarkaModel("Trayal");
		a.setPrecnik(14);
		a.setSirina(167);
		a.setVisina(87);
		
		assertEquals("AutoGuma [markaModel=" + "Trayal" + ", precnik=" + 14 + ", sirina=" + 167 + ", visina="
				+ 87 + "]", a.toString());
	}
	
	@Test
	public void testEqualsTrue() {
		a.setMarkaModel("Trayal");
		a.setPrecnik(14);
		a.setSirina(167);
		a.setVisina(87);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Trayal");
		a2.setPrecnik(14);
		a2.setSirina(167);
		a2.setVisina(87);
		
		assertTrue(a.equals(a2));
	}
	
	@Test
	public void testEqualsFalse() {
		a.setMarkaModel("Trayal");
		a.setPrecnik(14);
		a.setSirina(167);
		a.setVisina(87);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(14);
		a2.setSirina(167);
		a2.setVisina(87);
		
		assertFalse(a.equals(a2));
	}
}
