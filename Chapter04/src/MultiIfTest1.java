/*
 * 작성일 : 2024년 3월 19일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 다중 if 문 실습.
 * 		 음수인지 양수인지 0인지 판단하는 프로그램.
 * 
 * 문제분석 : 음수는 0보다 적은 수이다.
 * 		   	정수를 입력받아 0보다 작은지 비교, 판단.
 * 			양수는 0보다 큰수다
 * 			입력 받은 정수가 0보다 큰지 판단.
 * 			0은 0이다
 * 
 * 알고리즘 : 1. 정수를 입력 받는다.
 * 			2. 만약에 입력받은 정수가 0보다 작은가?
 * 				2-1 -0은 음수입니다. 출력
 * 			3. 아니니고 만약에 입력받은 정수가 0보다 크면?
 * 				3-1 00은 양수입니다
 * 			4. 아니면
 * 				4-1 0입니다.
 */

import java.util.Scanner;

public class MultiIfTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// 2. 음수인지
		if(num<0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
		// 3. 양수인지
		else if(num>0) {
			System.out.println(num + "은(는) 양수입니다.");
		}
		//4. 아니면(0이다)
		else {
			System.out.println("0입니다.");
		}
		
		
		

	}

}

