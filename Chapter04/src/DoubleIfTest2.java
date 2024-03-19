/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : if,else문 실습.
 * 		 하나의 정수를 입력 받아 짝수인지 홀수인지 확인하는 프로그램.
 * 
 * 문제분석 : 짤수 => 2로 나눈 나머지가 0이다
 * 			홀수 => 2로 나눈 나머지가 0이 아니다
 * 			(if)짝수 아니면 (else)홀수이다.
 * 			홀수 아니먄 짝수이다.
 * 
 * 알고리즘 : 1. 정수를 입력 받는다.
 * 			2. 입력 받은 정수가 짝수인지 판단한다.
 * 				2-1 00은 짝수이다 출력
 * 			3. 아니면 
 * 				3-1 00은 홀수이다.
 */

import java.util.Scanner;

public class DoubleIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		//짝수
		if (num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		//홀수
		/*Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		if (num%2!=0) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}*/
		
		

	}

}
