package lang;

public class PointTest {

	public static void main(String[] args) {
		Point point = new Point();
		
		System.out.println( point.getClass().getName() );
		System.out.println( point.hashCode() );
		System.out.println( point.toString() );
		//getClass().getName() + "@" + hashCode()
		//System.out.println( point );
		
		System.out.println( "====================" );
		
		/* String 객체와 비교 */
		String s1 = new String( "hello" );
		System.out.println( s1.getClass().getName() );
		System.out.println( s1.hashCode() );
		System.out.println( s1.toString() );
		
		//String s2 = new String( "hello" );
		//System.out.println( s2.hashCode() );
		
		
	}

}
