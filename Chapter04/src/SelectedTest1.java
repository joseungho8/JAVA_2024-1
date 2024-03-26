/*
 * 작성일 : 2024년 3월 26일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 3자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다
 * 		홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 * 		세자리 수는 100에서 999까지 이다.
 * 		123을 입력했을때 1은 홀수 2는 짝수 3은 홀수 100의 자리는 홀수 10의 자리는 짝수 1의 자리는 홀수이다
 * 		입력받은 값에다가 100을 나눈 몫이 백의 자리 숫자가 된다
 * 		그 값의 나머지에 10을 나눈 몫이 십의 자리 숫자가 된다
 * 		그 값의 나머지가 1의 자리 숫자가 된다.
 */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
				Scanner stdIn = new Scanner(System.in);
				
				// 1. 숫자를 입력 받는다.
				System.out.print("3자리의 십진수를 입력 : ");
				int  num = stdIn.nextInt();
				int num100 = num / 100; // 100의 자리수
				int num10 = (num % 100)/10; // 10의 자리수
				int num1 = (num % 100)/1;// 1의 자리수
				
				if(num>=100 && num <= 999)
				{
					if (num100 % 2 == 0)//100의 자리수가 짝수면
					{
						System.out.println("100의 자리 숫자는 짝수입니다.");
					}
					else//홀수면
					{
						System.out.println("100의 자리 숫자는 홀수입니다.");
					}
					if (num10 % 2 == 0)//10의 자리수가 짝수면
					{
						System.out.println("10의 자리 숫자는 짝수입니다.");
					}
					else//홀수면
					{
						System.out.println("10의 자리 숫자는 홀수입니다.");
					}
					if (num1 % 2 == 0)//1의 자리수가 짝수면
					{
						System.out.println("1의 자리 숫자는 짝수입니다.");
					}
					else//홀수면
					{
						System.out.println("1의 자리 숫자는 홀수입니다.");
					}
				}
				else//(100-999)사이의 숫자가 아니면
				{
					System.out.println("(100-999)숫자가 아닙니다.");
				}
				
				
				

	}

}
