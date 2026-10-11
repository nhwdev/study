package test0105;
/*
 *1. 동물클래스 : Animal => 추상클래스 
 *   멤버변수 : 동물의 종류, 다리수
 *   생성자   : 동물의 종류와 다리수를 입력받아 생성
 *   메서드  : void eat(); =>추상 메서드
 *          String sound(); =>추상메서드
 *          
 *2. 강아지 클래스 : Dog : Animal 클래스를 상속 받는다 
 *   생성자   : 매개변수 없이 생성함.
 *   메서드  : void eat() : "주인이 주는대로 먹는다"
 *          String sound() : "멍멍"
 *          
 *3. 원숭이 클래스 : Monkey: Animal 클래스를 상속 받는다 
 *   생성자   : 매개변수 없이 생성
 *   메서드  : void eat() : "나무위에서 열매를 따먹는다"
 *          String sound() : "끼끼"
 *          
 *4. 사자 클래스 : Lion : Animal 클래스를 상속 받는다 
 *   생성자   : 매개변수 없이 생성함.
 *   메서드  : void eat() : "초식동물을 사냥해서 먹는다"
 *          String sound() : "어흥"
 */
abstract class Animal{
	String type;
	int leg;
	Animal(String type, int leg){
		this.type=type;
		this.leg=leg;
	}
	abstract void eat();
	abstract String sound();
}

class Dog extends Animal{
	Dog(){
		super("강아지",4);
	}

	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}

	@Override
	String sound() {
		return "멍멍";
	}
	
}

class Monkey extends Animal{

	Monkey() {
		super("원숭이", 2);
	}

	@Override
	void eat() {
		System.out.println("나무위에서 열매를 따먹는다");
	}

	@Override
	String sound() {
		return "끼끼";
	}
	
}
class Lion extends Animal{
	
	Lion(){
		super("사자", 4);
	}

	@Override
	void eat() {
		System.out.println("초식동물을 사냥해서 먹는다");
		
	}

	@Override
	String sound() {
		return "어흥";
	}
}
public class Test03 {
	public static void main(String[] args) {
		Animal animal[] = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Monkey();
		animal[2] = new Lion();
		for(Animal a : animal) { 
			System.out.println(a.type + "=>다리수:"+a.leg + ":"+a.sound());
			a.eat();
		}

	}
}
