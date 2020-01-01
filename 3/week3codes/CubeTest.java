package week3codes;

public class CubeTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + " " + cube(i));
		}
	}

	public static int cube(int i) {
		return i * i * i;
	}
}
