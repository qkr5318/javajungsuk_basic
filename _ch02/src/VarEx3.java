public class VarEx3 {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		final int score = 100;
//		score = 200;
		
		boolean power = true;
		
		byte b = 127;	//- 128~127
		
		int oct = 010;	// 8����, 10������8
		int hex = 0x10; // 16����, 10�����δ� 16
		
		long l = 10_000_000_000L; // long Ÿ���� ���ͷ�(��)�� L�� �ٿ���� Ÿ�Կ����� �ȳ���.
		
		float f = 3.14f;		// float Ÿ���� ���ͷ�(��)�� f�� ���ٿ�����Ѵ�. 
		double d = 3.14;		// double Ÿ���� ���ͷ�(��)�� d�� �Ⱥٿ��� �������. java �Ǽ��� ���� defualt�� double�̱� �����̴�.
		double d1 = 3.14f;		// double Ÿ���� ������ ���̻� f�� �ٿ��� ������ ���� �ʴ´�. �� ������ double���� float���� ������ �� �б� ������ �����ϴ�.
		// java�� ������ �� �ִ� ������ �� ���� Ÿ���� ���� Ÿ���� Ÿ���� ����ϱ� �Ѵ�. �׷��� ������ �� ���� ���̻縦 ���ͷ��� ����ϴ��� ����� ����.
		// ������ �ڹٴ� ������ Ÿ���� �̸� ���Ͽ� �޸𸮸� Ȯ���ϱ� ������ ���踦 �Ҷ� �󸶸�ŭ�� ��������� ������� �� �����ϰ� Ÿ���� ���ؾ��� ������ ���̴°� ����.
		// ���� ���� ������ ũ�׸��� �ִ°Ŵ� ����� ���ٰ� �����ϴ°� �����ϱ� ����.
		
		char ch = 'A';
		int i = 'A';
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		// ���ڿ� Ÿ���� String�� ������ Ÿ���̴�. (������ Ÿ���� StringŬ�������� �����ϴ� Ŭ�����̴�.)
		// String Ÿ���� "" ����鵵 ���ڿ��� ����Ͽ� ������ �����ʰ�
		// ABCD ����� ���̳� ���ڸ� "" �ȿ��� �������ָ� �� ���ڿ��� ����Ѵ�.
		// 7 + "7" �� ���ڷ� ����ϴ� ���� �ƴ� ���ڿ��� ����� 77�� ������� ���´�.
		// �׷��� 7 + 7 + "7"�� 777�� ������ ���� �ƴ� ���ڳ��� ���� ���������� ������ 14+ ���ڿ� 7��
		// 147�� ��°����� ���´�.
		System.out.println( 7+ 7+ "7" + "���ڿ� Ȯ���ϱ�");
		// ������ ���ڿ��� ���� ������ �ȴٸ� ���ڿ��� �ν��Ͽ� 777�� ���´�.
		System.out.println( "7" + 7+ 7 + "���ڿ� Ȯ���ϱ�");
		
		
		System.out.println(score);
		System.out.println(power);
		System.out.println(b);
		//-------------------------------------------
		System.out.println(oct);
		System.out.println(hex);
	//	System.out.printf(hex);
		// system print�� 10�����θ� ǥ���ϰ� ���λ糪 �ٸ� �����δ� ������� �ʴ´�.
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
