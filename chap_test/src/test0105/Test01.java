package test0105;
/*
* 회사의 직원(Employee)은 여러 유형으로 나뉜다
* 모든 직원은 직원구분, 이름, 주소, 소속부서를 가진다.
* 1. 직원(Employee) 클래스에서는 getPay 메서드를 구현할 수 없다.
     하지만 멤버 메서드로 처리한다
* 2. 정규직원(FormalEmployee) : 직원번호,직급, 연봉을 가진다.
*             급여는 연봉 /12
* 3. 비정규직원(InformalEmployee) : 계약 만료일(Date),기본임금을 가진다.
*             급여는 기본임금을 지급한다
* 4. 임시직원(TempEmployee) : 시간당임금(timepay), 근무시간(emptime)을 가진다.
*             급여는 시간당 임금 * 근무시간으로 지급한다.
* 모든직원은 급여를 받아야 하므로. 각각의 클래스에 getPay() 메서드를 구현하기
* 
* 생성자 : 구동 클래스에 맞도록 구현
* 
* [결과]
정규직=>박정규:4166666
비정규직=>유비정:1000000
임시직=>손임시:250000

전체 직원 급여합:5416666
*/

import java.util.Date;

abstract class Employee{
	String type,name,addr,dept;
	Employee(String type,String name, String addr, String dept){
		this.name= name;
		this.addr= addr;
		this.dept= dept;
		this.type= type;
	}
	abstract int getPay();
}

class FormalEmployee extends Employee{
	String rank, no;
	int salary;
	public FormalEmployee(String name, String addr, String dept, String no, String rank, int salary) {
		super("정규직",name, addr, dept);
		this.rank = rank;
		this.salary = salary;
	}
	@Override
	int getPay() {
		return salary/12;
	}
}
class InformalEmployee extends Employee{
	Date date;
	public InformalEmployee(String name, String addr, String dept, Date date, int pay) {
		super("비정규직", name, addr, dept);
		this.date = date;
		this.pay = pay;
	}
	int pay;
	@Override
	int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}
}
class TempEmployee extends Employee{
	int timePay,empTime;

	public TempEmployee(String name, String addr, String dept, int timePay, int empTime) {
		super("임시직",name, addr, dept);
		this.timePay = timePay;
		this.empTime = empTime;
	}

	@Override
	int getPay() {
		// TODO Auto-generated method stub
		return timePay*empTime;
	}
}


public class Test01 {
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new FormalEmployee("박정규","서울","총무부","001","과장",50000000);
		Date exDate = new Date(); //오늘 날짜
		exDate.setTime(exDate.getTime() + (1000L*60*60*24*365));
		System.out.println(exDate);
		emps[1] = new InformalEmployee("유비정","서울","기획부",	exDate,1000000);
		emps[2] = new TempEmployee("손임시","서울","영업부",	25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type + "=>" + e.name + ":" + e.getPay());
			total += e.getPay();
		}				
		System.out.println("전체 직원 급여:" + total);
	}
}
