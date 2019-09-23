package in.dsbakshi.demos.utility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameSplitterTest {

	private NameSplitter nameSplitter;
	
	@Before
	public void setUp() {
		nameSplitter = new NameSplitter();
	}

	@Test
	public void testSplitName() {
		SplitName splitName = nameSplitter.splitName("Test Name");
		assertNotNull(splitName);
		assertEquals(splitName.getFirstName(), "Test");
		assertEquals(splitName.getLastName(), "Name");
	}

}
