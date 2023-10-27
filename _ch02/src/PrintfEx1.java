
public class PrintfEx1 {

	public static void main(String[] args) {
		
		System.out.println(10/3); // ����� ����
		System.out.println(10.0/3); // ����� �Ǽ� ������ �Ǽ� ǥ���̸� ������� �Ǽ��� ���´�.
		
		// ���� ��� 
		System.out.printf("10���� == "+"%d%n", 15); // 10����
		System.out.printf("8���� == "+"%o%n", 15); //  8����
		System.out.printf("16���� == "+"%x%n", 15); //  16����
		System.out.printf("2���� == "+"%s%n", Integer.toBinaryString(15)); // 2����
		
		// ���λ簡 ������ ���
		System.out.printf("8���� ���λ�  == "+"%#o%n", 15); //  8����
		System.out.printf("16���� ���λ� == "+"%#x%n", 15); //  16����
		
		float f = 123.456789f;
		double d = 123.456789;
		System.out.printf("�Ҽ������� f == "+"%f%n",f);	// �Ҽ��� 6�ڸ����� ���
		System.out.printf("�Ҽ������� d == "+"%f%n",d);
		// float�� ���е��� 7�ڸ����̱� ������  ������ ����� 9�� �ƴ϶� 7�� ������ ���̴�.
		// �� ���е��� ���� double�� 15�ڸ��̱� ������ ������ ����� 9�� ���´�.
	
		// �������·� ���
		System.out.printf("���� ǥ���� ���� == "+"%e%n",f);
		System.out.printf("������ ���� == "+"%g%n%n",f);
		
		//[]�� �̿��� ���� ���
		System.out.printf("[%5d]%n",10); // ������ �ڸ��� ������� ���� ũ�� �� ����Ѵ�.
		System.out.printf("[%5d]%n",1234567); // ������ �ڸ��� ������� ���� ũ�� �� ����Ѵ�.
		System.out.printf("[%-5d]%n",10); //���� ���� -
		System.out.printf("[%05d]%n",10);  // ����ä���	
		
		double d1 = 1.23456789;
		System.out.printf("[%14.10f]%n",d1); //[] �ȿ� 14�ڸ��� ������� 
		System.out.printf("[%14.6f]%n",d1); // ��ü�ڸ��� 14�ڸ��� �Ҽ��� ���� 6�ڸ�
		
		System.out.printf("[%s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%-20s]%n","www.codechobo.com");
		System.out.printf("[%.10s]%n","www.codechobo.com");
		

	}

}
