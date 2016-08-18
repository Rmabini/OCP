package org.ocp.chapter.nio;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Runner3Main {

	public static void main(String[] args) {
		excerise(Paths.get("folder1"), Paths.get("folder1"));
	}

	/*
	 * Copy file from source destination
	 * 
	 */
	static void excerise(Path source, Path destination) {
		try {
			// Files.copy(source,
			// destination,StandardCopyOption.REPLACE_EXISTING);
			//Files.move(source, destination,StandardCopyOption.REPLACE_EXISTING);
		    Files.deleteIfExists(source);
		   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
