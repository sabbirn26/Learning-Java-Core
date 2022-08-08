package calculator_project;

import java.util.*;

public class ReadInput {
	public static String read() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input expression: ");

		String inputLine = scanner.nextLine();

		scanner.close();

		return inputLine;

	}

}
