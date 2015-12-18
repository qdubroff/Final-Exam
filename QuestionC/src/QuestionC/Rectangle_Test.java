package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Rectangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void testExceptionIsThrown() throws IllegalRectangle {
		thrown.expect(IllegalRectangle.class);
		Rectangle r2 = new Rectangle(-5, -10);

	}
	
	@Test
	public void Rectangle_Test2() throws IllegalRectangle {
		
	
		Rectangle r2 = new Rectangle(5, 10);
		assertTrue(r2.ComputeArea() == 50);
	}
	

}