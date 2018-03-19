/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author Mica
 *
 */
public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja v; 
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
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		v = null;
		a = null;
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test 
	public void testDodajGumu() {
		v.dodajGumu(a);
		assertEquals(a, v.getGume().getFirst());
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuDodata() {
		v.getGume().add(a);
		v.dodajGumu(a);
		
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#setGume(java.util.LinkedList)}.
	 */
	@Test
	public void testSetGume() {
		v.setGume(new LinkedList<AutoGuma>());
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumu() {
		v.pronadjiGumu(a.getMarkaModel());
	}
	
	@Test
	public void testPronadjiGumuNull() {
		v.pronadjiGumu(null);
	}
	@Test
	public void testPronadjiGumuNemaJe() {
		v.pronadjiGumu("tr");
	}
}
