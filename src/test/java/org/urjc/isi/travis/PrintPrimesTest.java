package org.urjc.isi.travis;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	}
	
	//Hay que ir del arco 2 al 10 directamente(no entre en el while)
	@Test
	public void testApartado3() {
		PrintPrimes.main(new String[] {"1"}); //Necesito pasarle a PrintPrimes un 1
		assertEquals("Prime: 2\n", outContent.toString());
	}
	
	@Test
	public void testApartado7() {
		PrintPrimes.main(new String[] {"4"}); //Si le paso 4 sera 2, 3, 5 , 7
		assertEquals("Prime: 2\nPrime: 3\nPrime: 5\nPrime: 7\n", outContent.toString());
	}

}
