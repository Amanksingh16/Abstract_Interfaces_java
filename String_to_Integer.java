import java.util.Scanner;

public class String_to_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values in String");
		String a = sc.next();
		String b = sc.next();
		
		int x = Integer.valueOf(a);
		int y = Integer.valueOf(b);
		
		System.out.println("The sum of two String values after converting : "+(x+y));

	}

}
