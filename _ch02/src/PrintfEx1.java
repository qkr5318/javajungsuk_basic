
public class PrintfEx1 {

	public static void main(String[] args) {
		
		System.out.println(10/3); // 결과값 정수
		System.out.println(10.0/3); // 결과값 실수 한쪽이 실수 표현이면 결과값도 실수로 나온다.
		
		// 진수 출력 
		System.out.printf("10진수 == "+"%d%n", 15); // 10진수
		System.out.printf("8진수 == "+"%o%n", 15); //  8진수
		System.out.printf("16진수 == "+"%x%n", 15); //  16진수
		System.out.printf("2진수 == "+"%s%n", Integer.toBinaryString(15)); // 2진수
		
		// 접두사가 나오게 출력
		System.out.printf("8진수 접두사  == "+"%#o%n", 15); //  8진수
		System.out.printf("16진수 접두사 == "+"%#x%n", 15); //  16진수
		
		float f = 123.456789f;
		double d = 123.456789;
		System.out.printf("소수점형식 f == "+"%f%n",f);	// 소수점 6자리까지 출력
		System.out.printf("소수점형식 d == "+"%f%n",d);
		// float는 정밀도가 7자리수이기 때문에  마지막 출력이 9가 아니라 7이 나오는 것이다.
		// 더 정밀도가 좋은 double은 15자리이기 때문에 마지막 출력이 9가 나온다.
	
		// 지수형태로 출력
		System.out.printf("지수 표현식 형식 == "+"%e%n",f);
		System.out.printf("간략한 형식 == "+"%g%n%n",f);
		
		//[]를 이용한 형식 출력
		System.out.printf("[%5d]%n",10); // 지정한 자리와 상관없이 값이 크면 다 출력한다.
		System.out.printf("[%5d]%n",1234567); // 지정한 자리와 상관없이 값이 크면 다 출력한다.
		System.out.printf("[%-5d]%n",10); //왼쪽 정렬 -
		System.out.printf("[%05d]%n",10);  // 공백채우기	
		
		double d1 = 1.23456789;
		System.out.printf("[%14.10f]%n",d1); //[] 안에 14자리를 만들어줌 
		System.out.printf("[%14.6f]%n",d1); // 전체자릿수 14자리중 소수점 기준 6자리
		
		System.out.printf("[%s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%-20s]%n","www.codechobo.com");
		System.out.printf("[%.10s]%n","www.codechobo.com");
		

	}

}
