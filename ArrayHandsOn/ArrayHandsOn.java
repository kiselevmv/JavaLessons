import java.util.Arrays;
import java.util.ArrayList;

public class ArrayHandsOn {
	public static void main (String[] args) {
		int[] ages;
		ages = new int[4];
		ages[0] = 18;
		int[] scores = {90, 85, 88, 92 };
		System.out.println(scores[1]);
		int[][] coord = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(coord[0][1]);
		int[] numbers = {5, 10, 15};
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.set(1, "David");
		names.remove(2);
		System.out.println(names);
	}
}