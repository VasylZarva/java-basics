package com.epom.io.create;

import java.io.File;
import java.io.IOException;

/**
 * @author Vasyl Zarva.
 */
public class FileOperations {

	public static void main(String[] args) throws IOException {
//		File file = new File("first_file.txt");
//		System.out.println("exist : " + file.exists());
//
//		System.out.println("Name " + file.getName());
//		System.out.println("Absolute " + file.getAbsolutePath());
//		System.out.println("Canonical " + file.getCanonicalPath());
//		System.out.println("Path " + file.getPath());

		System.out.println("separator " +File.separator);
		final String root = "src" + File.separator +"main" + File.separator + "java" + File.separator + "com" + File.separator + "epom" + File.separator ;

		System.out.println(root + "io" + File.separator + "create" + File.separator + "FileOperations");

		File rootFile = new File(root);

		System.out.println("Root: is dir " + rootFile.isDirectory());
		printDirAsFiles(rootFile);
	}
	private static void printDir(final File dir) {
		for (String name : dir.list()) {
			File subFile = new File(dir, name);
			if (subFile.isDirectory()) {
				System.out.println("Dir : ");
				printDir(subFile);
				continue;
			}
			System.out.println("file : " + name);
		}
	}
	private static void printDirAsFiles(final File dir) {
		final File[] internalFiles = dir.listFiles();
		if (internalFiles == null)
			return;
		for (final File subFile : internalFiles) {
			if (subFile.isDirectory()) {
				System.out.println("Dir : " + subFile.getPath() + ", size : " + subFile.length());
				printDirAsFiles(subFile);
				continue;
			}
			System.out.println("file : " + subFile.getName() + ", size : " + subFile.length());
		}
	}
}
