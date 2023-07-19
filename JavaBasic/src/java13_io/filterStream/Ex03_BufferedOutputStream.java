package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {

	public static void main(String[] args) {

		File file = new File("./src/java13_io/filterStream", "BufferedOut.txt");
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file, true));	//추가모드
			
			String data = "CherryBananaApple";
			
			bos.write(data.getBytes(), 0, data.length());
			bos.flush(); //출력 버퍼 지우기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
