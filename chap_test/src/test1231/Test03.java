package test1231;
/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살
*/

class Animal{
	String ani;
	int age;
	
	Animal(String ani, int age){
		this.ani=ani;
		this.age=age;
	}
	Animal(String ani){
		this(ani,1);
	}
	Animal( int age){
		this("사람",age);
	}
	
	void info() {
		System.out.println(ani +":"+age+"살");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		a1.info();
		a2.info();
		a3.info();
	}
}
