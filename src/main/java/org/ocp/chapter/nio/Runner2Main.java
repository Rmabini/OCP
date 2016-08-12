package org.ocp.chapter.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Map;
import java.util.Map.Entry;

public class Runner2Main {

	public static void main(String[] args) {
		/*
		 * exercise("test"); exercise("test/test.sql"); exercise("folder");
		 * exercise(null);
		 */

		/*
		 * exercise1("test/test.sql"); exercise1("test/test.xml");
		 * exercise1("test");
		 */

		/*
		 * exercise2("test"); exercise2("test/test.sql");
		 */

		// exercise3("test");

		// exercise4("test");

		exercise6("test");

	}
    
	/*
	 * Read file attribute using Files.readAttribute passing the right Attribute
	 * file
	 */
	static void exercise6(final String source) {
		Path path = Paths.get(source);
		try {
			BasicFileAttributes basic = Files.readAttributes(path, PosixFileAttributes.class);
			System.out.println("Is Directory " + basic.isDirectory());
			System.out.println("Creation Time " + basic.creationTime());
			System.out.println("LastAccessTime " + basic.lastAccessTime());
			System.out.println("LastModified " + basic.lastModifiedTime());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Read file attribute using Files.readAttribute passing the right Attribute
	 * file
	 */
	static void exercise5(final String source) {
		Path path = Paths.get(source);
		try {
			BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("Is Directory " + basic.isDirectory());
			System.out.println("Creation Time " + basic.creationTime());
			System.out.println("LastAccessTime " + basic.lastAccessTime());
			System.out.println("LastModified " + basic.lastModifiedTime());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Using file input source, output the file attribute using
	 * Files.readAttribute Passing *
	 */

	private static void exercise4(final String source) {
		Path path = Paths.get(source);
		String pattern = "dos:*";
		try {
			Map<String, Object> map = Files.readAttributes(path, pattern);
			for (Entry entry : map.entrySet()) {
				System.out.println("Value " + entry.getValue());
				System.out.println("Key " + entry.getKey());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * Using input file source, output the file attributes using
	 * Files.readAttribute
	 * 
	 */
	static void exercise3(final String source) {
		Path path = Paths.get(source);
		try {
			Map<String, Object> map = Files.readAttributes(path, "size,lastModifiedTime,lastAccessTime");
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.println("Value " + entry.getValue());
				System.out.println("Key " + entry.getKey());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Requirement input a source needs to output file attribute
	 * Files.getAttributes
	 */
	static void exercise2(String source) {

		if (source == null) {
			System.out.println("Source is Null");
			System.exit(0);
		}

		Path actualSource = Paths.get(source);
		try {
			Object object = Files.getAttribute(actualSource, "size", LinkOption.NOFOLLOW_LINKS);
			System.out.println("File Size " + object);
			object = Files.getAttribute(actualSource, "lastModifiedTime");
			System.out.println("Last Modified Date " + object);
			object = Files.getAttribute(actualSource, "creationTime");
			System.out.println("File Created Date " + object);
			object = Files.getAttribute(actualSource, "dos:hidden");
			System.out.println("File hidden " + object);
			object = Files.getAttribute(actualSource, "isDirectory");
			System.out.println("Directory " + object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Requirement input a source needs to output file attribute into the
	 * console. Using isWritbale, isExecutable, isReadable
	 * 
	 */
	static void exercise1(String source) {
		if (source == null) {
			System.out.println("Source is Null");
			System.exit(0);
		}
		Path actualSource = Paths.get(source);
		System.out.printf("Readable %b, Writetable %b , Executable %b ", Files.isReadable(actualSource),
				Files.isWritable(actualSource), Files.isExecutable(actualSource));
		System.out.println("-------------------");
	}

	/*
	 * Requirement 1) input file needs to check if exist e.g actual file,
	 * directory
	 * 
	 * 2) Output message, is directory, is file
	 */

	static void exercise(String source) {
		if (source == null) {
			System.out.println("Source is Null");
			System.exit(0);
		}

		Path actualSource = Paths.get(source);

		if (Files.exists(actualSource, LinkOption.NOFOLLOW_LINKS)) {
			System.out.println("File/Folder " + actualSource.getFileName() + " exists");
			if (Files.isDirectory(actualSource, LinkOption.NOFOLLOW_LINKS)) {
				System.out.println("Folder " + actualSource.getFileName() + " exists");

			} else {
				System.out.println("File " + actualSource.getFileName() + " exists");

			}
		} else {
			System.out.println("File/Folder " + actualSource.getFileName() + " does not exists");
		}
	}
}
