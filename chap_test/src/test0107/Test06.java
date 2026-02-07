package test0107;

/*
  
 [결과] 
3.7 반올림: 4
3.7 소수점 버림: 3
 
 */
@FunctionalInterface
interface DoubleToInt {
    int process(double d);
}

public class Test06 {
    public static void main(String[] args) {
        // 1. 실수를 반올림하여 정수로 만드는 람다 (0.5 더해서 형변환)
        DoubleToInt round = a->{return (int)(a+0.5);};

        // 2. 실수의 정수 부분만 추출하는 람다
        DoubleToInt truncate = a->{return (int)a;};

        System.out.println("3.7 반올림: " + round.process(3.7));
        System.out.println("3.7 소수점 버림: " + truncate.process(3.7));
    }
}