
public class test {
	public static void main(String[] args) {
		int x = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				x++;
			}
			x++;
		}
		
		System.out.println(x);
	}
}