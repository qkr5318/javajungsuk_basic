import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scanner Ŭ������ ��ü�� ���� (�ν��Ͻ� ����)
		Scanner scan = new Scanner(System.in);
		
		
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("dd"+num);
		System.out.println("ss"+num2);
		
		
		String input = scan.nextLine();
		int num3 = Integer.parseInt(input);
		System.out.println(num3);
		
		scan.close();
	}
	

}
