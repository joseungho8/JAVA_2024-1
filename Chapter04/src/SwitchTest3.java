/*
 * 작성일 : 2024년 3월 26일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 조건식 연습.
 * 		숫자와 연산자를 입력 받아
 * 		사칙연산 프로그램을 작성하시오.
 * 		입력 방식 : 3 + 4 (뛰어쓰기로 구분)
 * 
 *  [문제분석 및 알고리즘]
 *  	숫자 연산자 숫자를 입력 받아
 *  	해당 연산자에 따른 결과를 출력한다.
 */

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 월을 입력 받는다.
		System.out.print("사칙연산 입력 (스페이스바로 구분) : ");
		int input1 = stdIn.nextInt();
		/* 
		 * 사용자로부터 입력된 문자열에서 첫 번째 문자, 즉 연산자를 추출한다.
		 * stdIn.next()는 문자열을 입력받는 메서드이다.
		 * 입력된 문자열에서 첫번째 문자를 추출하기 위해서는 .charAt(0)(여기서 0은 문자의 위치를 뜻한다)을 사용한다.
		 * 3 + 4와 같이입력했을 때 '+' 연산자를 추출할 수 있다
		 */
		char op = stdIn.next().charAt(0);
		int input2 = stdIn.nextInt();
		
		switch (op)
		{
		case '+' :
			System.out.println(input1 +" + " + input2 + " = " + (input1 + input2) );
			break;
		case '-':
			System.out.println(input1 + " - " + input2 + " = " + (input1 - input2) );
			break;
		case '*':
			System.out.println(input1 + " * " + input2 + " = " + (input1 * input2) );
			break;			
		case '/':
			if (input2 == 0)
			{
				System.out.println("나눗셈을 실행할 수 없습니다.");
				break;
			}
			else
			{
				System.out.println(input1 + " / " + input2 + " = " + (double)(input1 / input2) );
				break;
			}
		default :
			System.out.println("잘못된 계산 입니다.");
			break;
		}
		
	
			
		

	}

}
