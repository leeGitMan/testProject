package edu.kh.test.testProject;

	// package(관련된 코드들의 묶음) 명명 규칙
	// 1.웹개발은 최소 3레벨 이상 ex) name.name.name
	// 2.프로젝트 주소의 기반(거꾸로) 



//한줄 주석
/*
 범위 주석
 */
public class HelloWorld {
	public static void main(String[] args) {
		// 메인 메소드: 실행을 할 수 있께 하는 구문 --> 이것이 있어야 프로젝트 실행 가능
		
		System.out.println("Hello World"); // 영문
		System.out.println("헬로우 월드~"); // 한글
		System.out.println("asdasdasd");
		System.out.println("눈이 와~");
		System.out.println("123456"); // 숫자
		System.out.println("3.14159216");
		
		/*
		""(쌍따옴표): 문자열을 나타냄
		쌍따옴표 안에 작성된 텍스트(코드)는 단순 문자열로 인식한다
		 */
	
		System.out.println("1 + 2");
		System.out.println(1+2);
		System.out.println((1+2)*3);
		System.out.println((1+2)+(3+6)*3);
		
		// " " 안에 작성되지 않은 코드는 숫자, 변수로 인식한다.
		
		// ""(문자열) + 숫자 함께 작성
		
		System.out.println("14*19 = " + 266);
		
		/*
		숫자와 숫자끼리의 덧셈은 실제 덧셈 연산이다.
		근데 문자열과 숫자 or 문자열과 문자열 더하기는 ==> 이어쓰기이다.(한마디로 붙인다는 거)
		*/
		
		System.out.println("14*19 = " + 14*19);
		
		/*
		notice) 자바는 사칙연산 우선순위를 그대로 따른다.
		그래서 우선 계산을 원하면 () 괄호 사용
		*/
		
		System.out.println((1+2) * (3+6) + (2+6) / (1+3));
		System.out.println((15)/(5));
		System.out.println(1+2*3/3);
		System.out.println(1+2*8/4);
		System.out.println(1-2);
		System.out.println(8/4);
		System.out.println(11&5);
		System.out.println(1==1);
		System.out.println(1*2 == 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
