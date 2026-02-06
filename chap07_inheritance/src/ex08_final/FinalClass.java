package ex08_final;
/*
 * final 제어자 : 변경불가의 의미
 * final 클래스(종단클래스) : 상속불가 클래스. 다른 클래스의 부모클래스 불가
 * 
 * String,Math 클래스가 final 클래스
 */
class A {}
public final class FinalClass extends A{  //다른 클래스의 자손클래스는 가능
}
/*
 * class SubClass extends FinalClass{ //다른 클래스의 부모클래스는 불가함 } class MyString
 * extends String {}
 */