package lang;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer( 10 );
		Character c = new Character( 'c' );
		Float f = new Float( 3.14 );
		Boolean b = new Boolean( true );
		
		// Auto Boxing
		Integer j = 10;
		
		// Auto Unboxing
		//int k = 20 + j.intValue();
		int k = 20 + j;
		
		System.out.println( k );
	}
	
	public static void swap( Integer a, Integer b) {
		//int temp = a.intValue();
		//a = (b.intValue());
		/* 객체지만 내부를 변경 할 수 없다 */
	}

}
