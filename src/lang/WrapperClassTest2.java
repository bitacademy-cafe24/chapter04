package lang;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		System.out.println( Character.toLowerCase( 'C' ) );
		System.out.println( Character.isDigit( '1' ));
		System.out.println( Character.isDigit( 'e' ));
		
		String s = "123a4";
		
		if( s.matches("-?\\d+(\\.\\d+)?") == false ) {
			System.out.println( "숫자가 아닙니다." );
		} else {
			int i = Integer.parseInt(s);
			System.out.println( i );
		}
		
		// 프로그램 로직(변수 검증) 할 때에는
		// try ~ catch 문을 사용하지 말 것
		/*
		try { 
			int i = Integer.parseInt(s);
			System.out.println( i );
		} catch( NumberFormatException e ) {
			System.out.println( "숫자가 아닙니다." );
		}
		*/
		
		System.out.println( Integer.parseInt( "10", 10));
		System.out.println( Integer.parseInt( "A", 16));
		System.out.println( Integer.toBinaryString( 255 ));
		System.out.println( Integer.toHexString( 255 ) );
		System.out.println( Double.parseDouble( "44.56" ));
		System.out.println( Long.parseLong( "1234567890" ) );
		
		System.out.println( String.valueOf( 12345 ) );
	}

}
