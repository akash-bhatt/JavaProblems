package com.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.java.problems.CeasarCipher;

public class CeasarCipherTest {
	
	@Test
	public void encryptTest() {
		
		//setup
		String str = "zebra";
				
		//act
		CeasarCipher ceasarCipher = new CeasarCipher();
		char[] result = ceasarCipher.encrypt(str);
		
		//asset
		String expectedvalue = "difve";
		assertEquals(new String(result), expectedvalue);
	}

}
