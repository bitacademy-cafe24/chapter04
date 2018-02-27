package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader( System.in, "UTF-8" ) );
			while( true ) {
				System.out.print( ">>" );
				String line = br.readLine();
				if( line == null ) {
					break;
				}
				
				if( "exit".equals( line ) ) {
					break;
				}
				
				System.out.println( line );
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( br != null ) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
