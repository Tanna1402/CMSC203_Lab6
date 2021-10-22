import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	private GradeBook g1;
	private GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		
		/**	
		 * 	TASK#3
		 * 	Create 2 objects hold 5 test scores
		 */
		g1 = new GradeBook(5);
	    g2 = new GradeBook(5);
	    
	    /**	
	     * 	TASK#3
	     * 	Call the addScore method 
	     */
	    g1.addScore(90.0);
	    g1.addScore(85.0);
	    
	    g2.addScore(80.0);
	    g2.addScore(95.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		/**
		 * TASK#3
		 * Set 2 objects of the gradebook to null
		 */
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue((g1.toString()).equals("90.0 85.0 "));
	    assertTrue((g2.toString()).equals("80.0 95.0 "));
	    
	    assertEquals(2,g1.getScoreSize(),0.0001);
	    assertEquals(2,g2.getScoreSize(),0.0001);
	}

	@Test
	void testSum() {
		assertEquals(175.0, g1.sum(), .0001);
		assertEquals(175.0,g2.sum(),.0001);

	}

	@Test
	void testMinimum() {
		assertEquals(85.0, g1.minimum(),.001);
		assertEquals(80.0,g2.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		 assertEquals(90.0, g1.finalScore(), .0001);
	     assertEquals(95.0, g2.finalScore(), .0001);
	}

}
