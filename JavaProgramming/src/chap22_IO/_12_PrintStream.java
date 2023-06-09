package chap22_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class _12_PrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintStream ps = new PrintStream(
					new FileOutputStream("C:/lecture/Java/printStream.txt"));
			
			byte[] byteArr = {1, 2, 3, 4, 5, 127};
			
			for(int i = 0; i < byteArr.length; i++) {
				//출력스트림에는 값을 찍어볼 수 있는 기능이 없는데
				//PrintStream/PrintWriter를 이용하면
				//값을 콘솔에 출력하는 것이 아니고 출력 형식으로 같이 파일에 내보내준다.
				//OutputStream os = new OutputStream("파일");
				//os.print/println() => 이런 기능은 존재하지 않는다.
				//오직 프린트 스트림만 가지고 있다.
				//값들을 내보내 때 print메소드를 호출한 부분도 함께 내보낸다.
				ps.println(byteArr[i]);
			}
			ps.write(byteArr);
			ps.flush();
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
