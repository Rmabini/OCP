package org.ocp.chapter.nio;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunnerMain {
	
	public static void main(String[] args) {
		//exercise1();
		//exercise2();
		//exercise3();
		//exercise4();
		//exercise5();
		//exercise6();
		//exercise7();
		//exercise8();
		//exercise9();
		//exercise10();
		//exercise11();
		//exercise12();
		//exercise13();
		//exercise14();
		//exercise15();
		exercise16();
		
	}
	
    
	private static void exercise16() {
		Path path = Paths.get("./../../test.txt");
		System.out.println(path);
	}


	private static void exercise15() {
		Path path = Paths.get("/folder/folder1/folder2");
		System.out.println(path.subpath(1,23));
	}


	private static void exercise14() {
		Path path = Paths.get("folder/folder1/folder2/folder3");
		System.out.println(path.subpath(0, 1));
		System.out.println(path.subpath(0, 2).isAbsolute());
		System.out.println(path.subpath(0, 2).toAbsolutePath());
	}


	private static void exercise13() {
		Path path = Paths.get("folder/folder2/folder3");
		System.out.println(path.toAbsolutePath());
	}


	private static void exercise12() {
		Path path = Paths.get("/folder/folder1/folder2/folder3/hello.txt");
		Path currentParent = path.getParent();
		System.out.println("File Name "+path.getFileName());
		System.out.println("File get Root "+path.getRoot());
		while ((currentParent = currentParent.getParent()) !=null){
			System.out.println(currentParent.getParent());
		} 
	}


	private static void exercise11() {
		Path path = Paths.get("/folder/folder1/folder2/folder3/folder4/hello.txt");
	    for (int i = 0; i < path.getNameCount(); i++) {
	    	System.out.println(path.getName(i));
			
		}	
	}

	private static void exercise10(){
		Path path = Paths.get("/folder", "folder2","folder3");
		System.out.println(path.getName(1));
	}
	
	private static void exercise9() {
		Path path = Paths.get("/folder", "folder2","folder3");
		System.out.println(path.getNameCount());
		
	}

	private static void exercise8(){
		
		Path path = Paths.get("/testProject", "hello.txt");
		System.out.println(path.getParent().normalize().toAbsolutePath());
	}
	
	private static void exercise7() {
		File[] roots= File.listRoots();
		for (File file : roots) {
			System.out.println(file);
		}
		Iterable<Path> iterable = FileSystems.getDefault().getRootDirectories();
		for (Path path : iterable) {
			System.out.println(path);
		}
		
	}

	private static void exercise6() {
		Path path = Paths.get("Hello.txt");
		try {
			System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void exercise5() {
		Path path = Paths.get("Hello.txt");
		File file = path.toFile();
		System.out.println(file.getAbsolutePath());
	}

	private static void exercise4() {
		try {
			FileSystem fileSystem = FileSystems.getFileSystem(new URI("https://www.selikoff.net"));
		    Path path = fileSystem.getPath("duck.txt");
		    System.out.println(path);
		    
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void exercise3() {
		Path path = FileSystems.getDefault().getPath("/testFolder");
		Path path2 =FileSystems.getDefault().getPath("folder","Hello.txt");
		System.out.println(path.resolve(path2.normalize()));
	}

	private static void exercise2(){
		Path path = Paths.get("/../testFolder/../folder");
		Path path2 = Paths.get("/test2");
		
		System.out.println(path.relativize(path2));
		System.out.println(path2.normalize());
		
	}
	
	private static void exercise1() {
		Path path = Paths.get("/testFolder/../folder");
		Path path2 = Paths.get("file","Hello.txt");
		System.out.println(path.resolve(path2));
	//	System.out.println(path.relativize(path2));
	}

}
