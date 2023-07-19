package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {

	public static void main(String[] args) {

		File file = new File("./src/java13_io/filterStream", "DataTest.txt");
		
		DataOutputStream dos = null;
		
		try {
			//File -> FileOutputStream -> BufferedOutputStream -> DataOutputStream
			//파일 -> 파일출력 -> 성능 향상 -> 자료형 유지 -> dos변수 이용
			dos = new DataOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(file)));
			
			//OutputStream
			dos.write(65);
			dos.write("Apple".getBytes());
			
			//자료형을 유지하면서 출력하기
			dos.writeBoolean(true);	//1B
			dos.writeChar('가');	//2B
			dos.writeInt(123);		//4B
			
			//버퍼 비우기
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null)dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
