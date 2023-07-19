package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		//Source.txt 파일의 내용을 읽어들여 Destination.txt파일로 저장한다
		//49,520,698 bytes
		//Source.txt -> FileCopy -> Destination.txt
		
		//----------------------------------------------
		File file1 = new File("src/java13_io/fileStream", "Source.txt");
		System.out.println("[Test] exists : " + file1.exists());
		File file2 = new File("src/java13_io/fileStream", "Destination.txt");
		System.out.println("[Test] exists : " + file2.exists());
		
		//입출력 스트림 객체 변수
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//파일 입출력을 보조할 변수
		byte[] buf = new byte[1024];	//임시 저장소
		int len = -1;	//입출력 길이(크기)
		int total = 0;	//총 입출력된 데이터의 길이(크기)
		
		try {
			fis = new FileInputStream(file1);	//Source.txt 파일에 대한 입력 스트림
			fos = new FileOutputStream(file2);	//Destination.txt 파일에 대한 출력 스트림
			
			//in 스트림에서 더 이상 읽어들일 데이터가 없을 때
			//->Source.txt 파일의 오프셋(offset)이 파일의 끝에 도달했을 때
			//->End of Stream -> End of File -> EOF
			
			//파일 입력
			while((len = fis.read(buf)) != -1) {
				//파일 출력
				fos.write(buf, 0, len);
				
				//진행상황 콘솔 출력
//				System.out.print(new String(buf, 0, len));
				
				//복사된 데이터의 총 길이 계산
				total += len;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(">> " + total + " 바이트 복사 완료");
		
	}

}
