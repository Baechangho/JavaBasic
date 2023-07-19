package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {

		//Source.txt 파일의 내용을 읽어들여 Destination.txt파일로 저장한다
		//49,520,698 bytes
		//Source.txt -> FileCopy -> Destination.txt
		
		//----------------------------------------------
		File file1 = new File("src/java13_io/fileStream", "Source.txt");
		System.out.println("[Test] exists : " + file1.exists());
		File file2 = new File("src/java13_io/fileStream", "Destination.txt");
		System.out.println("[Test] exists : " + file2.exists());
		
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[1024];	//임시 저장소
		int len = -1;	//입출력 길이(크기)
		int total = 0;	//총 입출력된 데이터의 길이(크기)
		
		try {
			FileInputStream fis = new FileInputStream(file1);
			FileOutputStream fos = new FileOutputStream(file2);
			
			while((len = fis.read(buf)) != -1) {
				fos.write(buf, 0, len);
				total += len;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">> " + total + " 바이트 복사 완료");
		
	}

}
