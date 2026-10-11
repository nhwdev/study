package ex02_output;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * Writer : 문자형 출력스트림
 *          1char(2byte) 단위로 출력
 *          
 * Writer OutputStreamWriter(OutputStream)  
 *          바이트형출력스트림을 문자형 출력스트림으로 변경 스트림
 */
public class MainEx02_Writer {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		out.flush();
	}
}