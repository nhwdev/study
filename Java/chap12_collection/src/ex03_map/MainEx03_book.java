package ex03_map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Book {
	String title, author;
	int price;

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
		return "(" + title + "," + author + "," + price + ")";
	}
}

public class MainEx03_book {
	static Map<String, Book> libmap = new HashMap<>();

	public static void main(String[] args) {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
			try {
				menu = scan.nextInt();
				if (menu == 0)
					break;
				switch (menu) {
				case 1:
					addBook();
					break; // 추가
				case 2:
					deleteBook();
					break; // 삭제
				case 3:
					printBook();
					break; // 조회
				case 4:
					findBook();
					break; // 검색
				default:
					System.out.println("잘못된 입력입니다. 0~4까지만 입력하세요");
				}
			} catch (InputMismatchException e) {
				System.out.println("0~4까지의 숫자만 입력하세요");
				scan.next();
			}
		}
	}

	/*
	 * 제목을 입력받아서 도서 정보를 출력하기
	 */
	private static void findBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색 도서의 제목을 입력하세요");
		String title = scan.next();
		Book book = libmap.get(title);
		if (book == null)
			System.out.println(title + " 도서는 없습니다.");
		else
			System.out.println(title + "도서정보:" + book);
	}

	/*
	 * 제목을 입력받아서 도서를 libmap 에서 제거하기
	 */
	private static void deleteBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 도서의 제목을 입력하세요");
		String title = scan.next();
		// title 에 해당하는 도서 정보가 삭제되고, value 에 해당하는 Book 객체 리턴
		Book book = libmap.remove(title);
		if (book == null) {
			System.out.println(title + "의 도서는 없습니다.");
		} else {
			System.out.println(book + " 도서가 삭제 되었습니다.");
		}
	}

	/*
	 * 전체 도서목록을 조회하기
	 */
	private static void printBook() {
		System.out.println("도서 목록 :");
		for (Book b : libmap.values()) {
			System.out.println(b);
		}
	}

	/*
	 * 제목,저자,가격을 입력받아서 libmap 에 저장하기
	 */
	private static void addBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("등록할 도서의 제목,저자,가격을 입력하세요");
		String title = scan.next();
		String author = scan.next();
		int price = scan.nextInt();
		libmap.put(title, new Book(title, author, price));
		System.out.println(title + "도서가 추가되었습니다.");
	}
}