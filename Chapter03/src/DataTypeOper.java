/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 연산과 자료형.
 * 		 두개의 정수를 입력 받아 평균을 계산하는 프로그램.
 * 
 * 		 1. 두 정수를 입력 받는다.
 * 	 	 2. 평균을 계산한다.
 * 		 3. 평균을 출력한다.
 */
// 입력을 위한 라이브러리.
import java.util.Scanner;

public class DataTypeOper {

	public static void main(String[] args) {
		// 두 개의 정수를 입력 받는다.
		//Scanner 객체 생성.
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = stdin.nextInt();
		System.out.print("두 번쨰 정수 입력 : ");
		int num2 = stdin.nextInt();
		
		double avg1 = (num1 + num2) / 2; //정수 / 정수 = 정수기 떄문에 논리오류가 발생한다.
		System.out.println("정수 연산 : "+ num1 + " + " + num2 +" = " + avg1);
		
		double avg2 = (num1 + num2) / 2.0; // 정수 / 정수 =  정수기 때문에 나누는 수 1개를 실수로 바꿔준다.
		System.out.print("정수 연산 : "+ num1 + " + " + num2 +" = " + avg2);
		
		
		
		
	}

}
