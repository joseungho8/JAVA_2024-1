/*
 * 작성일 : 2024년 3월 22일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 내포된 if 문 실습.
 * 		 점수를 입력받아 학점을 출력하시오.
 * 		 점수는 0~100점 사아 입니다
 * 		 점수 범위를 벗아나면 "잘못된 점수입니다" 출력하시오.
 * 
 * 문제분석 : 입력받은 점수가 0~100점 사이 인가?
 * 		    점수가 0~100점 사이가 아니면?
 * 			 90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 			점수는 정수로 입력 받는다.
 * 
 * 알고리즘 : 1. 점수(정수)를 입력 바든다.
 * 			2. if 점수의 범위가 0~100점 사이인가?
 * 				1) A
 * 				2) B
 * 				
 * 
 * 			3. else 아닌가
 * 				1) "잘못된 점수입니다"출력
 */

import java.util.Scanner;
public class NestedIfTest1 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 점수를 입력 받는다.

System.out.print("점수 입력 : ");
		int score = stdIn.nextInt();
		
		if (score>=0 && score <= 100) {
			if (score >= 90) {
				System.out.println("A학점 입니다.");
			}
			else if (score >= 80) {
				System.out.println("B학점 입니다.");
			}
			else if (score >= 70) {
				System.out.println("C학점 입니다.");
			}
			else if (score >= 60) {
				System.out.println("D학점 입니다.");
			}
			else {	
				System.out.println("F학점 입니다.");
			}
		}
		else {
			System.out.println("잘못된 점수입니다");
		}


	}

}


/*

나이가 18 ~ 25
나이가 18세 이상이고, 나이가 25세 이하

if((age >= 18) && (age <= 25))
	
(gender == "남자"&& age >= 18) && (gender == "남자" && age<=25)

score1, score2, score3
jumsu1, jumsu2, jumsu3
kor, eng,math

국어점수가 70점 이상이고, 영어점수도 70점이상이고, 수하검수도 70점 이상
모드 => 다 만족해여한다

kor >= 70 && eng >= 70 && math >= 70

(kor >= 70 && eng >= 70 && math >= 70)&&(sum >= 240)

total >= 40 && total <= 40  (<50)

두 수가 짝수인 경우
num1, num2
짝수?? 2로 나눈 나머지가0이다.
		
(num1 % 2 == 0) && (num2 %2 == 0)


*/