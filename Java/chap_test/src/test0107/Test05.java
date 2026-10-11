package test0107;
/*
 [결과]
10은 5의 배수인가? true
70과 40의 합은 100 초과인가? true
  
 */
@FunctionalInterface
interface IntChecker {
    boolean check(int a, int b);
}
public class Test05 {
    public static void main(String[] args) {
        // 1. a가 b의 배수인지 확인하는 람다
        IntChecker isMultiple =(a,b)->{return (a%b)==0;};

        // 2. a와 b의 합이 100보다 큰지 확인하는 람다
        IntChecker isLargeSum =(a,b)->{return (a+b)>=100;};

        System.out.println("10은 5의 배수인가? " + isMultiple.check(10, 5));
        System.out.println("70과 40의 합은 100 초과인가? " + isLargeSum.check(70, 40));
    }
}