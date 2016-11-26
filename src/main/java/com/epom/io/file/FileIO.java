package com.epom.io.file;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;

/**
 * @author Vasyl Zarva.
 */
public class FileIO {

	public static void main(String[] args) throws IOException {
//		writeToFile("abc1.txt");
//		System.out.println("---------------");
//		readFromFile("abc.txt");
//		System.out.println("---------------");
//		writeToMultipleFiles("multi_1.txt", "multi_2.txt");
//		System.out.println("---------------");
//		readSequenceInputStream("multi_1.txt", "multi_2.txt");
//		System.out.println("---------------");
//		readFromKeyboard();
//		System.out.println("---------------");
//		readByScanner("abc.txt");
//		System.out.println("---------------");
//		readByStreamFiles("abc.txt");
//
//		System.out.println("created");
	}

	private static void writeToFile(final String fileName) {
		try (final FileOutputStream fout = new FileOutputStream(fileName)) {
			for (final String line : generateStrings(100_000_000)) {
				fout.write(line.getBytes());//converting string into byte array
			}
			System.out.println("success...");
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	private static void readFromFile(final String fileName) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(fileName);
			int i;
			while ((i = fin.read()) != -1) {
				if ((char) i == 10) {
					System.out.println();
					continue;
				}
				System.out.print((char) i);
			}
			fin.close();
		} catch (final Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(fin);
		}
	}

	private static void writeToMultipleFiles(final String... fileNames) {

		final String generatedContent = generateStrings(5).stream().collect(Collectors.joining());

		try {
			final ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(generatedContent.getBytes());

			for (final String fileName : fileNames) {
				try (FileOutputStream fout = new FileOutputStream(fileName)) {
					bout.writeTo(fout);
				}
			}

			bout.flush();
			bout.close();//has no effect
			System.out.println("success...");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static void readSequenceInputStream(final String fileName1, final String fileName2) {
		try {
			FileInputStream fin1 = new FileInputStream(fileName1);
			FileInputStream fin2 = new FileInputStream(fileName2);

			SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
			int i;
			while ((i = sis.read()) != -1) {
				if ((char) i == 10) {
					System.out.println();
					continue;
				}
				System.out.print((char) i);
			}
			sis.close();
			fin1.close();
			fin2.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFromKeyboard() {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);

			String name = "";

			while (!name.equals("stop")) {
				System.out.println("Enter data: ");
				name = br.readLine();
				System.out.println("data is: " + name);
			}

			br.close();
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readByScanner(final String fileName) {
		try (final Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void readByStreamFiles(final String fileName) {
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			String joined = stream.collect(Collectors.joining("\n"));
			System.out.println("List: \n" + joined);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<String> generateStrings(int count) {
		List<String> result = new ArrayList<>();
		int lines = count;
		while (lines > 0) {
			lines--;
			result.add("a");
		}
		return result;
	}
}
