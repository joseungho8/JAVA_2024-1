/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 3항 연산자.
 * 		 정수를 입력 받아 짝수인지 확인하는 프로그랢.
 */

import java.util.Scanner;

public class TemaryOpTest {

	public static void main(String[] args) {
		// Scanner 객체 생겅.
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = stdin.nextInt();
		
		boolean result; //boolean = True, False , string = "짝수입니다","홀수입니다"
		result = (num % 2)==0 ? true : false;
		
		System.out.print(num + "은 짝수입니까? ");
		System.out.println(result);
				
	}

}
