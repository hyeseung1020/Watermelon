import java.util.Scanner;

public class Watermelon {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		int watermelon = sc.nextInt();
		final double pi = 3.14;

		double area = (watermelon*watermelon) * pi;
		System.out.println("수박의 넓이는: " + area);
	}
}
