package lang;

public class StringTest01 {

	public static void main(String[] args) {
		// 문자 " escape
		String s = "I say \"hello\"";
		System.out.println( s );
		
		//문자 ' escape
		char c = '\'';
		
		//문자 \ escape
		String path = "d:\\cafe24";
		System.out.println(path);
		
		// \t, \n, \r, \b ....
		System.out.print("\n");
		System.out.println( "" );
		
		// + 연산
		String s1 = "Hello" + "World";
		String s2 = "Hello";
		s2 += "World";
		
		char[] cs = s2.toCharArray();
		System.out.println( cs );
	}

}
