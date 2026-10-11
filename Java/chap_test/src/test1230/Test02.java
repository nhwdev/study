package test1230;


/*
다음 결과가 출력되도록 구동클래스(Test02)를 구현하기
구동클래스에서 출력은 Animal 클래스를 이용하기       

[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/
class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("맛있게 얌얌");
	}
	public String toString() {
		return "이름(name):" + name + "\n나이(age):" + age;
	}
}

public class Test02 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name ="원숭이";
		animal.age=20;
		System.out.println(animal);
		animal.eat();
	}
}
