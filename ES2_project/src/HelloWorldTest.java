import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testTest() {
		HelloWorld teste = new HelloWorld();
		int resultado = teste.cenasHelloWorld(10);
		assertEquals(11,resultado);
	}
	
	@Test 
	public void testHelloWorld() {
		HelloWorld teste = new HelloWorld();
		String result = teste.start();
		assertEquals("Hello World!",result);
		
	}

}
