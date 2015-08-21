//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AircraftnewTest {

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

	@Test
	public void testLooprun() {
		Aircraftnew a = new Aircraftnew();
			a.createContents();
			a.looprun(2);
			a.looprun(3);
			a.looprun(8);
			a.looprun(11);
			a.looprun(27);
			a.looprun(30);
			a.looprun(36);
			a.looprun(38);
		}
	}

