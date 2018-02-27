package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream( new FileOutputStream( "./123.txtx" ) );
		
			for( int i = '1'; i <= '9'; i++ ) {
				bos.write( i );
			}
			
			// 버퍼가 풀나지 않는 상태에서 플러시를 강제로 한다.
			// close() 호출하면 자동 플러시
			bos.flush();
			
			
		} catch (FileNotFoundException e) {
			System.out.println( "파일없음:" + e );
		} catch (IOException e) {
			System.out.println( "I/O 에러:" + e );
		} finally {
			try {
				if( bos != null ) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
