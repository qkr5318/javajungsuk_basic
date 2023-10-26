public class VarEx3 {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		final int score = 100;
//		score = 200;
		
		boolean power = true;
		
		byte b = 127;	//- 128~127
		
		int oct = 010;	// 8진수, 10진수로8
		int hex = 0x10; // 16진수, 10진수로는 16
		
		long l = 10_000_000_000L; // long 타입은 리터럴(값)에 L을 붙여줘야 타입오류가 안난다.
		
		float f = 3.14f;		// float 타입은 리터럴(값)에 f를 꼭붙여줘야한다. 
		double d = 3.14;		// double 타입은 리터럴(값)에 d를 안붙여도 상관없다. java 실수형 값은 defualt가 double이기 때문이다.
		double d1 = 3.14f;		// double 타입의 변수에 접미사 f를 붙여도 에러가 나지 않는다. 그 이유는 double형이 float보다 범위가 더 넓기 때문에 가능하다.
		// java는 저장할 수 있는 범위가 더 넓은 타입은 적은 타입의 타입을 허용하기 한다. 그래서 범위가 더 작은 접미사를 리터럴에 사용하더라도 상관이 없다.
		// 하지만 자바는 변수의 타입을 미리 정하여 메모리를 확보하기 때문에 설계를 할때 얼마만큼의 저장공간을 사용할지 잘 생각하고 타입을 정해쓰는 버릇을 들이는게 좋다.
		// 예로 작은 물건을 크그릇에 넣는거는 상관이 없다고 생각하는게 이해하기 쉽다.
		
		char ch = 'A';
		int i = 'A';
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		// 문자열 타입입 String은 참조형 타입이다. (참조형 타입은 String클래스에서 제공하는 클래스이다.)
		// String 타입은 "" 빈공백도 문자열로 취급하여 에러가 나지않고
		// ABCD 연결된 글이나 숫자를 "" 안에만 기입해주면 다 문자열로 취급한다.
		// 7 + "7" 은 숫자로 취급하는 것이 아닌 문자열로 취급해 77로 결과값이 나온다.
		// 그러면 7 + 7 + "7"은 777로 나오는 것이 아닌 숫자끼리 먼저 실행해졌기 때문에 14+ 문자열 7로
		// 147이 출력값으로 나온다.
		System.out.println( 7+ 7+ "7" + "문자열 확인하기");
		// 하지만 문자열이 먼저 나오게 된다면 문자열로 인식하여 777이 나온다.
		System.out.println( "7" + 7+ 7 + "문자열 확인하기");
		
		
		System.out.println(score);
		System.out.println(power);
		System.out.println(b);
		//-------------------------------------------
		System.out.println(oct);
		System.out.println(hex);
	//	System.out.printf(hex);
		// system print는 10진수로만 표현하고 접두사나 다른 진수로는 출력하지 않는다.
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		System.out.println(l);
		System.out.println(f); 
		System.out.println(d);
		System.out.println(d1);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("" + 7 + 7);
		System.out.println(7 + 7 + ""  );

		
	}
}
