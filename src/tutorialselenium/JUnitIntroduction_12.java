package tutorialselenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction_12 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before class..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after class..");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Runs always before every @test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Runs always after every @test");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 executed");
	}


}
