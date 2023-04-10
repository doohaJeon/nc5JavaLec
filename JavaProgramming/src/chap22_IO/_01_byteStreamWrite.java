package chap22_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _01_byteStreamWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("C:/lecture/Java/ex02.txt");
		
//			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			
			//1. byte를 1byte씩 출력
			byte num1 = -128;			
			byte num2 = 127;
			byte num3 = 0;
			os.write(num1);
			os.write(num2);
			os.write(num3);
//			osw.write("안녕하세요");

		
			os.flush();
//			osw.flush();
			os.close();
//			osw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

}
