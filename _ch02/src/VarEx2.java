import java.util.Date;

public class VarEx2 {

		public static void main(String[] args) {
			
			int x = 10, y = 20;
			int tmp;
			
			tmp = x;
			x = y;
			y = tmp;
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("tmp = " + tmp);
			
			Date today = new Date();
			System.out.println(today.getDay());
			System.out.println(today.getHours());
			System.out.println(today.getMinutes());
			System.out.println(today.getSeconds());
			System.out.println(today.getYear());
			System.out.println(today.getDate());
	}
}
