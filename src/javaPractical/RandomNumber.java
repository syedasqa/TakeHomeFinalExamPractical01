package javaPractical;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Random random = new Random();

		int[] array = new int[500];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt();
		}

		Arrays.sort(array);

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Give me a number: ");
			int n = scanner.nextInt();
			System.out.println("The nth smallest number is: " + array[n]);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
