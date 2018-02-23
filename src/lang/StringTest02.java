package lang;

public class StringTest02 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
		
		str2 = str3.toUpperCase();
		
		System.out.println( str1 );
		System.out.println( str2 );
		System.out.println( str3 );
		
		String str4 = str2.concat( "??" );
		System.out.println( str2 );
		System.out.println( str4 );
		
		// Method Chain
		String str5 = "!".concat( str2 ).concat( "@" );
		System.out.println( str5 );
		
		
	}

}
