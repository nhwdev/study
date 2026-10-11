package ex01_object;

//equals, hashCode 메서드 오버라이딩 하기
class HashCode {
	int value;

	HashCode(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof HashCode)
			return value == ((HashCode) obj).value;
		else
			return false;
	}
}

public class MainEx03_hashCode {
	public static void main(String[] args) {
		HashCode h1 = new HashCode(10);
		HashCode h2 = new HashCode(10);
		System.out.println("h1 == h2 :" + (h1 == h2));
		System.out.println("h1.equals(h2) : " + h1.equals(h2)); // 내용 비교
		System.out.println("h1.hashCode() : " + h1.hashCode()); // 내용기준 코드값
		System.out.println("h2.hashCode() : " + h2.hashCode());
		System.out.println("identityHashCode(h1) : " + System.identityHashCode(h1));
		System.out.println("identityHashCode(h2) : " + System.identityHashCode(h2));
	}
}