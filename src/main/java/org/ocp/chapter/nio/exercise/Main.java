package org.ocp.chapter.nio.exercise;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
	
	
	public static void main(String[] args) throws Exception{
		String[] data={
				"Line 1",
				"Line 2 2",
				"Line 3 3 3",
				"Line 4 4 4 4",
				"Line 5 5 5 5 5"
		};
		FileSystem zipFs = openZip(Paths.get("myData.zip"));
	}
	
	private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
		Map<String, String> providerProps =  new HashMap<>();
		providerProps.put("create", "true");
		URI zipUri = new URI("jar:file",zipPath.toUri().getPath(),null);
		FileSystem fileSystem = FileSystems.newFileSystem(zipUri,providerProps);
		
		return fileSystem;
	}
	
	void copyToZip(){
		
	}
	
	void writeToFileInZip1(){
		
	}
}
