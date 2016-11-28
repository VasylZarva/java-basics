package com.epom.io.watch;

import java.io.File;
import java.util.List;

/**
 * @author Vasyl Zarva.
 */
public interface DirectoryService {

	List<File> search(File directory, NameFilter filter);

	Long getDirectorySize(File directory, boolean recursive);

	void appendLinesToFile(File file, List<String> lines);

	void zip(File fileToZip);

	void unZip(File fileToZip);

	void delete(File toDelete);
}
