package testing;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AssertDemo2 {

	private ArrayList<String> basket;
	
	@BeforeAll
	public static void setup() {
		System.out.println("executes before all test cases");
	}
	
	@AfterAll
	public void teardown() {
		basket=null;
		System.out.println("executes after all test cases");
	}
	
	@BeforeEach
	public void setupEach() {
		System.out.println("executes before each test case");
		assertTrue(basket.isEmpty());
	}
	
	@AfterEach
	public void teardownEach() {
		basket=null;
		System.out.println("Executes after each test");
	}
	
	@Test
	public void testEmptyBasket() {
		System.out.println("testing empty basket");
		assertTrue(basket.isEmpty());
	}
	
	@Test
	public void testOneItem() {
		basket.add("Apple");
		System.out.println("Testing basket with 1 item");
		assertEquals(1,basket.size());
	}
	
}
