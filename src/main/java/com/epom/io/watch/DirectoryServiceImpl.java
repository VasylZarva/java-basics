package com.epom.io.watch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author Vasyl Zarva.
 */
public class DirectoryServiceImpl implements DirectoryService {


	@Override
	public List<File> search(File directory, NameFilter filter) {
		if (directory.exists() && directory.isDirectory())  {
			String[] matches = directory.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					name.startsWith("test");
					name.endsWith("test");
					return false;
				}
			});
		}
	}


	@Override
	public Long getDirectorySize(File directory, boolean recursive) {
		if (directory == null || !directory.exists() || !directory.isDirectory()) {
			return 0L;
		}

		long length = 0;
		for (File file : directory.listFiles()) {
			length = length + file.length();
		}
		return length;
	}

	@Override
	public void appendLinesToFile(File file, List<String> lines) {


	}

	@Override
	public void zip(File fileToZip) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileToZip.getAbsolutePath() + ".zip");
			ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

			ZipEntry zipEntry = new ZipEntry(fileToZip.getAbsolutePath());
			zipOutputStream.putNextEntry(zipEntry);


			zipOutputStream.closeEntry();
			zipOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	@Override
	public void unZip(File fileToZip) {
//		try {
//			FileInputStream fileInputStream = new FileInputStream(fileToZip.getAbsolutePath() + ".zip");
//			ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
//
//			ZipEntry zipEntry = new ZipEntry(fileToZip.getAbsolutePath());
//			ZipInputStream.
//
//			ZipInputStream.closeEntry();
//			ZipInputStream.close();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}


	}

	@Override
	public void delete(File toDelete) {
		if (toDelete == null || !toDelete.isFile())
			return;

			try {
				Files.deleteIfExists(Paths.get(toDelete.toURI()));
			} catch (IOException e) {
				e.printStackTrace();
			}


	}
}


