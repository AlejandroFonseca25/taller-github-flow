package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the amount of numbers you want to sum:");
		BufferedReader bufferedReader = new BufferedReader(new
				InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new
				OutputStreamWriter(System.out));
		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
		System.out.println("Enter the numbers you want to sum:");
		List<Integer> ar =
				Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int result = Result.simpleArraySum(ar);
		bufferedWriter.write("Your result is:\n" + String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}