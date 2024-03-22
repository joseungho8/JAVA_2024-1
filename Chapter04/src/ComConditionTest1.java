
/*
 * 작성일 : 2024년 3월 22일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 :  조건식 연습.
 * 		  월을 입력받아 해당 계절을 출력하시오.
 * 		  3,4,5월 => 봄
 * 		  6,7,8월 =>여름
 * 		  9,10,11월 => 가을
 * 		  12,1,2 => 겨울
 * 
 * 문제분석 : 1) if 월을 입력 받는다 (1~12)까지
 * 					if (3,4,5)면 봄
 * 					   (6,7,8)이면 여름
 * 					   (9,10,11)이면 가을
 * 					   (12,1,2)이면 겨울 출력		
 * 	
 * 			3) else 입렫된 값이 (1~12)사이가 아니라면 해당월은 없습니다. 출력
 * 
 * 알고리즘 : 
 */

import java.util.Scanner;

public class ComConditionTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
				Scanner stdIn = new Scanner(System.in);
				
				// 1. 월을 입력 받는다.
				System.out.print("월을 입력하세요 : ");
				int month = stdIn.nextInt();
				
				if(month>=3 && month <= 5)
				{
					System.out.println("봄 입니다");
				}
				else if(month>=6 && month <= 8)
				{
					System.out.println("여름 입니다");	
				}
				else if(month>=9 && month <= 11)
				{
					System.out.println("가을 입니다");	
				}
				else if(month==12 && month <= 2)
				{
					System.out.println("겨울 입니다");	
				}
				else
				{
					System.out.println("해당 월은 없습니다");
				}
}
}
