/**
 * 
 */
package com.java.problems;

import java.util.Base64;


/**
 * @author m_800199
 *
 */
public class ShowEncryption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String testStr = "Akash";
				
		String basej8Str = Base64.getEncoder().encodeToString(testStr.getBytes());
		
		System.out.println("This is Java Base 64 encoding::"+ basej8Str );
		
		org.apache.commons.codec.binary.Base64 codec = new org.apache.commons.codec.binary.Base64();
		
		String baseApacheStr = codec.encodeAsString(testStr.getBytes());
		
		System.out.println("This is Apache Base 64 encoding::"+ baseApacheStr );
		
		String resultj8Str = new String(Base64.getDecoder().decode(basej8Str));
		
		System.out.println("This is Java Base 64 decoding of Java Base64 String::"+ resultj8Str );
				
		String resultApacheStr = new String(codec.decode(baseApacheStr));
		
		System.out.println("This is Apache Base 64 decoding of Apache Base64 String::"+ resultApacheStr );
		

		resultj8Str = new String(Base64.getDecoder().decode(baseApacheStr));		
				
		resultApacheStr = new String(codec.decode(basej8Str));

		System.out.println("This is Java Base 64 decoding of Apache Base64 String::"+ resultj8Str );
		
		System.out.println("This is Apache Base 64 decoding of Java Base64 String::"+ resultApacheStr );

	}

}
