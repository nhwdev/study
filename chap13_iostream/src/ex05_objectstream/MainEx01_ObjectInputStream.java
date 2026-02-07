
package ex05_objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * object.ser 파일에 저장된 객체를 읽기
 * 
 * ObjectInputStream : ObjectOutputStream으로 출력된 데이터(객체)를 읽기 위한 스트림.
 * Object  readObject() : 객체를 읽어서 복원
 */
public class MainEx01_ObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("object.ser"));
//		Object c1 = ois.readObject(); //객체 읽기
//		Object c2 = ois.readObject();
		Customer c1 = (Customer)ois.readObject(); //객체 읽기
		Customer c2 = (Customer)ois.readObject();
		System.out.println(c1); //Customer 객체의 toString 메서드
		System.out.println(c2);
	}
}
