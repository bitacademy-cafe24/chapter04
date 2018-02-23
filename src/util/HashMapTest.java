package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		map.put( "둘리", 100 );
		map.put( "마이콜", 50 );
		map.put( "도우넛", 80 );
		map.put( "길동", 90 );
		
		// 중복
		int score = map.get( "둘리" );
		System.out.println( score );
		map.put( "둘리", 70 );
		score = map.get( "둘리" );
		System.out.println( score );
		
		//삭제
		map.remove( "둘리" );
		//cf Integer VS int
		// int i = map.get( "둘리" ); -> 예외 발생
		Integer i = map.get( "둘리" ); // -> null
		
		//평균
		int sum = 0;
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			System.out.println( key );
			int s = map.get( key );
			sum += s;
		}
		
		System.out.println( "평균:" + (sum/keySet.size()) );
		
	}

}
