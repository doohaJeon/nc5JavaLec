package chap22_IO;

import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class _08_byteStreamToCharStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write("aaa");
		String str = read();
		System.out.println(str);
	}
	
	public static void write(String str) {
		try {
			OutputStream os = new FileOutputStream("C:/lecture/Java/hp01.txt");
			
			//OutputStreamWriter를 이용해서 
			//바이트스트림 -> 문자스트림으로 변환
			Writer writer = new OutputStreamWriter(os, "UTF-8");
			
			writer.write(str + "\r\n");
			
			writer.flush();
			writer.close();
			
			
		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			fe.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//InputStreamReader를 이용해서 
	//바이트스트림 -> 문자스트림으로 변환해주는 메소드
	public static String read() {
		String resultStr = "";
		try {
			InputStream is = new FileInputStream("C:/lecture/Java/hp01.txt");
			Reader reader = new InputStreamReader(is);
			
			char[] charArr = new char[50];
			
			while (true) {
				
				int cnt = reader.read(charArr);
				if(cnt == -1) {
					break;
				}
				
				for (int i = 0; i < cnt; i++) {
					resultStr = resultStr + charArr[i];
				}
				
			}	
			reader.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return resultStr;
	}
	
}
