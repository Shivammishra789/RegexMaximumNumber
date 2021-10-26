package regex.Maximum;
import org.junit.Test;

import junit.framework.Assert;
public class LargestNumberInArrayTest {

	@Test
	public void findMaxTest() {
	int[] array = {4, 12, 48, 78, 45};
	int expectedValue = 78;
	int actualValue = LargestNumberInArray.findMax(array);
	Assert.assertEquals(expectedValue, actualValue);
	}
	@Test
	public void findMaxNegativeTest() {
	int[] array = {4,-48,-55};
	int expectedValue = 4;
	int actualValue = LargestNumberInArray.findMax(array);
	Assert.assertEquals(expectedValue, actualValue);
	
	}
}
