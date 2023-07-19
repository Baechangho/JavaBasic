package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		//출력 대상 파일
		File file = new File("./src/java13_io/fileStream", "output");
		System.out.println("[TEST] exists : " + file.exists());
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		
		try {
			//FileOutputStream은 객체가 생성될 때
			//출력 대상인 파일이 없으면 새롭게 생성한다
			
			//파일 출력 스트림 생성
//			fos = new FileOutputStream(file);		//쓰기모드
			fos = new FileOutputStream(file, true);	//추가모드(append모드)
//			fos = new FileOutputStream(file, false);//쓰기모드
			
			//파일 출력
			String data = "Cherry";
			fos.write(data.getBytes(), 0, data.length());
			//버퍼 비우기
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
