
import org.testng.asserts.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	String message = "Hello World";
	Message newMessage = new Message(message);
	
	@Test
	public void testPrintMessage(){
		Assert.assertEquals(message, newMessage.printMessage());
	}
}
