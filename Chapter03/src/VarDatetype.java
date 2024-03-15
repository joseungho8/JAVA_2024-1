/*
 * 작성일 : 2024년 3월 15일
 * 작성자 : 컴퓨터공학부 202195049 조승호
 * 설명 : 변수와 자료형.
 */
public class VarDatetype {

	public static void main(String[] args) {
		// 상수 선언
		final int MAX = 100;
		final double PI = 3.14;
		
		// PI = 3.141592; // 오류 발생. 상수는 한번 값이 결정 되면 변할 수 없다.
		
		int r = 5; // 정수
		double pi = 3.14159; //실수 변수
		String name = "조승호"; //문자열 ""
		char blood = 'O'; // 문자 '' 한글자
		// char blood1 = "AB"; //오류 발생, 문자는 1Byte
				
		//원주율 출력
		System.out.println("원주율은 " + PI + " 입니다.");
		System.out.println("원주율은 " + pi + " 입니다.");
		
		//원의 넓이 계산하여 출력		
		
		System.out.println("반지름이 "+ r +"인 원의 넓이 : " + r * r * pi);
		
		//원의 넓이를 계산한다.
		double area = r * r * pi;
		//원의 넓이를 출력한다.
		System.out.println("반지름이 " + r + "인 원의 넓이 : "+area+"입니다.");
		
		area = r * r * PI;
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다.\n",r,area);
	}

}
