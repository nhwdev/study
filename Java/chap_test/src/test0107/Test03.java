package test0107;
/*
  점수가 90점 이상이면 'A', 아니면 'B'를 반환하는 람다를 작성하세요.
  실행문이 여러 줄일 때는 중괄호와 return이 필요함을 주의!
  
  [결과]
85점의 등급: B
95점의 등급: A
  
 */
@FunctionalInterface
interface GradeChecker {
    char getGrade(int score);
}

public class Test03 {
	public static void main(String[] args) {
        GradeChecker checker = a-> {return a>90?'A':'B';};
        System.out.println("85점의 등급: " + checker.getGrade(85));
        System.out.println("95점의 등급: " + checker.getGrade(95));
	}
}

