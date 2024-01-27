package file.operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextFileOperations {

	public static void main(String[] args) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader bufferedFileReader = new BufferedReader(
						new FileReader(new File("C:\\Users\\sreek\\Downloads\\students.csv")));
				BufferedReader bufferedFISReader = new BufferedReader(new InputStreamReader(
						new FileInputStream(new File("C:\\Users\\sreek\\Downloads\\students.csv"))));
				BufferedWriter bufferedWriter = new BufferedWriter(
						new FileWriter(new File("C:\\Users\\sreek\\Downloads\\students_copy.csv")));
				FileWriter fileWriter = new FileWriter(new File("C:\\Users\\sreek\\Downloads\\students_copy.csv"));
				Scanner scanner = new Scanner(new File("C:\\Users\\sreek\\Downloads\\students.csv"))) {
			String value = null;
			System.out.println("Enter values that need to sent to console");
			for (int i = 0; i < 3; i++) {
				if (i % 2 == 0) {
					System.out.println(bufferedReader.readLine());
				} else {
					System.err.println(bufferedReader.readLine());
				}
			}
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
			while ((value = bufferedFileReader.readLine()) != null) {
				System.out.println(value);
			}

			System.out.println("***FILES***");

			for (String eachLine : Files.readAllLines(Path.of("C:\\Users\\sreek\\Downloads\\students.csv"))) {
				System.out.println(eachLine);
			}
			String name = "Karthik";
			name.getBytes();
			fileWriter.write(name);
			System.out.println("Next 10 lines will be written to file");
			for (int i = 0; i < 10; i++) {
				fileWriter.write(bufferedReader.readLine() + "\n");
			}
			String xml = "<obj>\r\n" + "	<group1>\r\n" + "		<value>test</value>\r\n"
					+ "		<property>nothing</property>\r\n" + "		<version>1.1</version>\r\n" + "	</group1>\r\n"
					+ "</obj>\r\n" + "\r\n" + "";
			Files.write(Path.of("C:\\Users\\sreek\\Downloads\\students_files.xml"), xml.getBytes());
		}
	}

}
